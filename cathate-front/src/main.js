import Vue from 'vue'
import App from './App.vue'
import Router from './routers';
import VueHead from 'vue-head';
import VueRouter from 'vue-router';

Vue.config.productionTip = false
Vue.use(VueHead);
Vue.use(VueRouter)

new Vue({
  router : Router,
  render: h => h(App),
}).$mount('#app')
