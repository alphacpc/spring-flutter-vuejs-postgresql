import { createApp } from 'vue'

import App from './App.vue'

import './assets/style.css'

import router from './routers'

createApp(App).use(router).mount('#app')
