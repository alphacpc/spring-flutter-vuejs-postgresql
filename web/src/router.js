import { createRouter, createWebHistory } from 'vue-router';
import Home from './views/Home.vue';
import Detail from './views/Detail.vue';
import Admin from './views/Admin.vue'
import Login from './views/Login.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/detail', component: Detail },
  { path: '/admin', component: Admin },
  { path: '/connexion', component: Login },
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;