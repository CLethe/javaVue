import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import Element from 'element-ui'
import router from "@/router/index";
import "element-ui/lib/theme-chalk/index.css"
axios.defaults.baseURL = 'http://localhost:8081';

Vue.use(Element);

Vue.config.productionTip = false;
Vue.prototype.$axios = axios;

new Vue({
  el: "#app",
  router,
  render: h => h(App),
  // components: {App}
}).$mount('#app');
