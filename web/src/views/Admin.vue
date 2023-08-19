<script setup>
import { ref } from 'vue'
const count = ref(0)
</script>

<template>
    <h1>Admin page</h1>
  <button @click="count++">Count is: {{ count }}</button>
</template>

<style scoped>
button {
  font-weight: bold;
}
</style>