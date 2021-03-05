<template>
  <div class="justify-content-center row">
    <nav aria-label="...">
      <ul class="pagination">
        <li class="page-item" :class="(pages.current == 1) ? 'disabled' : ''" v-on:click="showPrevious(pages.current != 1)">
          <span class="page-link" >Previous</span>
        </li>
        <li class="page-item" v-if="pages.current != 1" v-on:click="showOnPage(1)">
          <span class="page-link">1</span>
        </li>
        <li class="page-item active">
          <span class="page-link">
            {{pages.current}}
            <span class="sr-only">(current)</span>
          </span>
        </li>
        <li>
          <span class="page-item">
            <form @submit="showOnInput">
              <input type="number" class="page-link page-input border border-warning mx-1" placeholder="..." v-model="pages.input" :min="1" :max="pages.allPages">
              <input type="submit" style="display: none;"/>
            </form>
          </span>
        </li>
        <li class="page-item" v-if="pages.current < pages.allPages" v-on:click="showOnPage(pages.allPages)">
          <span class="page-link">{{pages.allPages}}</span>
        </li>
        <li class="page-item" :class="(pages.current == pages.allPages) ? 'disabled' : ''" v-on:click="showNext(pages.current != pages.allPages)">
          <span class="page-link">Next</span>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
export default {
  data() {
    return {
      pages: {
        allPages: 5,
        current: 1,
        input: 1
      }
    }
  },
  methods: {
    showPrevious(condition) {
      if (!condition) {
        return;
      }
      this.pages.current = this.pages.current - 1;
      // refresh data
    },

    showNext(condition) {
      if (!condition) {
        return;
      }
      this.pages.current = this.pages.current + 1;
      // refresh next
    },

    showOnPage(value) {
      this.pages.current = value;
      // refresh on page
    },

    showOnInput(e) {
      e.preventDefault();
      this.pages.current = this.pages.input;
      // refresh on input
    },
  }
}
</script>

<style scoped>
.pagination {
  flex-wrap: wrap;
}

.page-input {
  width: 2.5rem;
}

.page-item:hover {
  cursor: pointer;
}

.page-link {
  color: black;
}
</style>