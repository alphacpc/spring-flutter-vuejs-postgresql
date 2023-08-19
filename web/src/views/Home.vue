<script setup>
import { ref } from 'vue'
import HelloWorld from '../components/HelloWorld.vue'
const count = ref(0)
</script>

<template>
    <h1>Home page</h1>
    <HelloWorld msg="Component HelloWord"/>
  <button @click="count++">Count is: {{ count }}</button>
</template>

<style scoped>
button {
  font-weight: bold;
}
</style>