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
      <div class="timeline-reacts border-top border-bottom row text-center">
        <div class="col-md-3 border">
          <i class="fas fa-thumbs-up text-success"></i>
          <div>Like ({{element.like}})</div>
        </div>
        <div class="col-md-3 border">
          <i class="fas fa-thumbs-down text-danger"></i>
          <div>Dislike ({{element.dislike}})</div>
        </div>
        <div class="col-md-3 border">
          <i class="fas fa-comments text-primary"></i>
          <div>Comment ({{element.comment}})</div>
        </div>
        <div class="col-md-3 border">
          <i class="fas fa-share text-warning"></i>
          <div>Share ({{element.share}})</div>
        </div>
      </div>
    </div>
    <Pagination />
  </div>
</template>
<script>
import Pagination from './Pagination';
export default {
  components: {
    Pagination
  },
  data() {
    return {
      elements : []
    }
  },
  created() {
    this.elements = [
      {
        id: 1,
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
</style>