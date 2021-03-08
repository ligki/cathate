<template>
  <div>
    <div v-for="(user, index) in topUser" :key="user.id">
      <a :href="user.url">
        <div>
          <span>{{index + 1}}. {{user.name}}</span> <span class="float-right">{{user.like}} <i class="fas fa-thumbs-up text-success"></i></span>
        </div>
      </a>
      
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      topUser: []
    }
  },
  created() {
    this.topUser = [
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      },
      {
        id: '1',
        name: 'Dang',
        avatar: 'https://cataas.com/cat?type=sq',
        url: '#',
        like: 5000
      }

    ]
  }
}
</script>
<style scoped>

</style>