<template>
  <div class="sidebar container">
    <div class="m-auto text-center">
      <h2>Menu</h2>
    </div>
    <div class="follow-us text-center mb-3">
      <div class="text-uppercase font-weight-bold pb-2">Follow Cat Hate</div>
      <div class="row">
        <div class="col-md-6">
          <a class="facebook" href="https://facebook.com/cathate"><i class="fab fa-facebook"></i> Follow Us</a>
        </div>
        <div class="col-md-6">
          <a class="twitter" href="#"><i class="fab fa-instagram"></i> Follow Us</a>
        </div>
      </div>
    </div>
    <div class="m-auto text-center">
      <h2>Top User</h2>
    </div>
    <TopUser />
  </div>
</template>
<script>
import TopUser from './TopUser'
export default {
  components: {
    TopUser
  }
}
</script>
<style scoped>
.follow-us {
  margin-top: 2rem;
  background-color: #F9873B;
  color: white;
  padding-top: 1rem;
  padding-bottom: 1rem;
}
a {
  color: white;
}
</style>