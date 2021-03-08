<template>
  <div class="container">
    <div class="m-auto text-center">
      <h2>Timeline</h2>
    </div>
    <div class="timeline-element py-3 my-3 border-dark text-center rounded" v-for="element in elements" :key="element.id">
      <div class="timeline-thumbnail">
        <img v-bind:src="element.thumbnail">
      </div>
      <div class="timeline-title">
        <a :href="element.url"><h4>{{element.title}}</h4></a>
      </div>
      <div class="timeline-author mb-2">
        <a :href="element.author.url" class="justify-content-center text-center align-items-center">
          <span>
            <img class="author-avatar rounded-circle mr-1" :src="element.author.avatar" :alt="element.author.name">
          </span>
          <span>
            <div><i>{{element.author.name}}</i><span class="text-muted"> ({{element.author.lastTime}})</span></div>
          </span>
        </a>
      </div>
      <div class="timeline-reacts border-top border-bottom row text-center">
        <div class="col-md-3 border" v-on:click="like(element.id)">
          <i class="fas fa-thumbs-up text-success"></i>
          <div>Like ({{element.like}})</div>
        </div>
        <div class="col-md-3 border" v-on:click="dislike(element.id)">
          <i class="fas fa-thumbs-down text-danger"></i>
          <div>Dislike ({{element.dislike}})</div>
        </div>
        <div class="col-md-3 border" data-toggle="modal" data-target="#modal-write-comment">
          <i class="fas fa-comments text-primary"></i>
          <div>Comment ({{element.comment}})</div>
        </div>
        <div class="col-md-3 border" v-on:click="share(element.id)">
          <i class="fas fa-share text-warning"></i>
          <div>Share ({{element.share}})</div>
        </div>
      </div>
    </div>
    <Pagination />

    <!-- Modal Write Comment -->
    <form @submit="writeComment">
      <div class="modal fade" id="modal-write-comment" role="dialog">
        <div class="modal-dialog">
        
          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Quick write a comment about this</h4>
              <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
              <div class="form-group">
                <textarea
                  name=""
                  class="form-control"
                  id=""
                  cols="30"
                  rows="10"
                  placeholder="Write a comment..."
                  v-model="commentContext"
                ></textarea>
              </div>

              <div class="form-check">
                <input
                  class="form-check-input"
                  type="checkbox"
                  value=""
                  v-model="commentConfirm"
                  true-value="yes"
                  false-value="no"
                />
                <label
                  class="form-check-label font-weight-bold"
                  for="defaultCheck1"
                >
                  Confirm
                </label>
              </div>
              <div v-if="errors.length">
                <div class="alert alert-warning" v-bind:key="error" v-for="error in errors" v-on:click="removeError(error)">
                  {{error}}
                </div>
              </div>
              <div v-if="success">
                <div class="alert alert-success">
                  {{success}}
                </div>
              </div>
            </div>
            <div class="modal-footer">
              <button type="submit" class="btn btn-success" v-if="!this.success">
                Post
              </button>
              <button type="button" class="btn btn-default" data-dismiss="modal" @click="resetComment">Close</button>
            </div>
          </div>
          
        </div>
      </div>
    </form>
  </div>
</template>
<script>
import Pagination from './Pagination';
import ReactService from '../service/ReactService';
import CommentService from '../service/CommentService';

export default {
  components: {
    Pagination
  },
  data() {
    return {
      elements : [],

      commentContext: '',
      commentConfirm: 'no',
      errors: [],
      success: ''
    }
  },
  methods: {
    like(id) {
      ReactService.like(id);
    },
    dislike(id) {
      ReactService.dislike(id);
    },
    comment() {
      ReactService.comment('comment');
    },
    share(id) {
      ReactService.share(id);
    },
    writeComment(e) {
      e.preventDefault();
      this.errors = [];
      if (!this.commentContext) {
        this.errors.push('Your comment is blank');
      }
      if (this.commentConfirm != 'yes') {
        this.errors.push('Just click Confirm');
      }

      if (this.errors.length === 0) {
        CommentService.writeComment({
          'author' : 'user',
          'context': this.commentContext
        });
        this.success = 'Success! You can close this dialog.';
      }

    },
    removeError(error) {
      const index = this.errors.indexOf(error);
      if (index > -1) { 
        this.errors.splice(index, 1);
      }
    },
    resetComment() {
      this.commentContext = '';
      this.commentConfirm= 'no';
      this.errors= [];
      this.success= ''
    }
  },
  created() {
    this.elements = [
      {
        id: 1,
        author: {
          name: 'Dang',
          avatar: 'https://cataas.com/cat?type=sq',
          url: '#',
          lastTime: '1 day'
        },
        thumbnail: 'https://www.w3schools.com/html/pic_trulli.jpg',
        title: 'Title so long about cat',
        url: '#',
        like: 1,
        dislike: 1,
        comment: 15,
        share: 24
      },
      {
        id: 2,
        author: {
          name: 'Minh',
          avatar: 'https://cataas.com/cat?type=sq',
          url: '#',
          lastTime: '3 days'
        },
        thumbnail: 'https://www.w3schools.com/html/pic_trulli.jpg',
        title: 'Title so long about cat',
        url: '#',
        like: 1,
        dislike: 1,
        comment: 15,
        share: 24
      }
    ]
  }
}
</script>

<style scoped>
.timeline-element:hover {
  background-color: whitesmoke;
}

.timeline-thumbnail img {
  width: 100%;
  height: auto;
}

a {
  color: black;
}

a:hover {
  color: #007FBB;
  font-weight: normal;
}

.author-avatar {
  width: 2rem;
  height: 2rem;
}

.timeline-author a {
  display: flex;
}

.timeline-author > * {
  color: #f9873A;
}

.timeline-reacts {
  margin: 0;
  padding: 0;
  width: 100%;
}

.timeline-reacts div {
  cursor: pointer;
  font-size: 0.75rem;
}

.timeline-reacts div:hover{
  background-color: rgb(216, 209, 209);
}

.text-muted {
  font-size: 0.7rem;
}

.text-muted:hover {
  font-size: 0.7rem;
}

</style>