// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.

// =============== Base libraries integration ==================
import Vue from 'vue'
import VueResource from 'vue-resource'
import VueTranslate from 'vue-translate-plugin'
import store from './store'
import VueRouter from 'vue-router'
import HomePage from 'components/Pages/HomePage'
import CinemasPage from 'components/Pages/CinemasPage'
import App from './App'

Vue.use(VueResource)
Vue.use(VueTranslate)

Vue.use(VueRouter)

// ================ All paths =====================
const routes = [
  { path: '/home', component: HomePage },
  { path: '/cinemas', component: CinemasPage }
]

const router = new VueRouter({
  routes,
  mode: 'history'
})

// ===== Bootstrap components integration (JQuery needed) ======
window.$ = window.jQuery = require('jquery')
require('bootstrap-sass')

// ======================== Vue Instance =======================
/* eslint-disable no-new */
new Vue({
  router,
  store,
  el: '#app',
  render: h => h(App)
})
