import Vue from "vue";
import Router from "vue-router";
import VueMeta from "vue-meta";

Vue.use(Router);
Vue.use(VueMeta, {
  keyName: "head",
});

const router = new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "Home",
      component: () => import("./components/views/HomePage"),
    },
    {
      path: "*",
      name: 'Not Found',
      component: () => import('./components/views/NotFound')
    }
  ],
});

export default router;
