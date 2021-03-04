<template>
  <div>
    <Header />
    <div class="container">
      <Fact />
    </div>
    <Footer />
  </div>
</template>

<script>
import Header from "../common/Header.vue";
import Footer from "../common/Footer";
import Fact from "../Fact"
export default {
  name: "HomePage",
  components: {
    Header,
    Footer,
    Fact
  },
  created() {
    document.title = 'CatHate'
  },
  
};
</script>

<style scoped>
</style>