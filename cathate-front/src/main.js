import Vue from 'vue'
import App from './App.vue'
import Router from './routers';
import VueHead from 'vue-head';
import VueRouter from 'vue-router';
import Vuex from 'vuex'

Vue.config.productionTip = false
Vue.use(VueHead);
Vue.use(VueRouter);
Vue.use(Vuex);

new Vue({
  router : Router,
  render: h => h(App),
}).$mount('#app')
