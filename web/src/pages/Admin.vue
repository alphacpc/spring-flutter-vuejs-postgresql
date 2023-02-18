<template>
  <div class="admin-container">
    <div class="div-sidebar">
      <Sidebar/>
    </div>
    <div class="body-admin">
       <QuillEditor theme="snow" toolbar="full"/>
    </div>
  </div>
 
</template>

<script>
import { QuillEditor } from '@vueup/vue-quill'
import '@vueup/vue-quill/dist/vue-quill.snow.css';
import '@vueup/vue-quill/dist/vue-quill.bubble.css';
import Sidebar from '../components/Admin/Sidebar.vue';


export default {
  components: {
    QuillEditor,
    Sidebar
  }
}
</script>

<style>

.admin-container{
  background: #181924;
  color: #FFF;
  display: flex;
  min-height: 100vh;
}

.div-sidebar{
  flex: 1;
}

.body-admin{
  flex: 6;
  background: pink;
  padding: 20px;
}

</style>