<template>
  <div>
    <Header />
    <div class="container">
      <Fact />
      <div class="row text-center">
          Advertising....
        </div>
      <div class="home-main my-3 px-1" id="timeline">
        <div class="row py-3">
          <div class="col-sm-8">
            <Timeline />
          </div>
          <div class="col-sm-4">
            <Sidebar />
          </div>
        </div>
      </div>
    </div>
    <Footer />
  </div>
</template>

<script>
import Header from "../common/Header.vue";
import Footer from "../common/Footer";
import Fact from "../Fact";
import Timeline from "../Timeline";
import Sidebar from "../SideBar";

export default {
  name: "HomePage",
  components: {
    Header,
    Footer,
    Fact,
    Timeline,
    Sidebar
  },
  created() {
    document.title = 'CatHate'
  },
  
};
</script>

<style scoped>
.home-main {
  background-image: url("data:image/svg+xml,%3csvg width='100%25' height='100%25' xmlns='http://www.w3.org/2000/svg'%3e%3crect width='100%25' height='100%25' fill='none' stroke='black' stroke-width='4' stroke-dasharray='6%2c 14' stroke-dashoffset='0' stroke-linecap='square'/%3e%3c/svg%3e");
}
</style>