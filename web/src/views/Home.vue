<script setup>

import Lieu from '../components/CardLieu.vue'


</script>

<template>

    <div className="banner-categories flex justify-center bg-white border-t-2 py-4 p-2">
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>lac</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>foret</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>savane</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>luxe</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>bord de mer</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>paysage</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>art</router-link>
        <router-link to="#" className="mr-10 bg-white text-green-400 font-normal text-xs border-[1px] border-green-500 shadow-lg min-w-[4rem] flex justify-center py-1 px-2  rounded-2xl"><fa icon="usrs"/>musique</router-link>
    </div>

    <div className="px-8 flex justify-start flex-wrap py-8">

        <Lieu image="img1.jpg" alt="image1"/>  
        <Lieu image="img1.jpg" alt="image2"/>  
        <Lieu image="img1.jpg" alt="image3"/>  
        <Lieu image="img1.jpg" alt="image4"/>  
        <Lieu image="img1.jpg" alt="image5"/>  
        <Lieu image="img1.jpg" alt="image6"/>  
        <Lieu image="img1.jpg" alt="image6"/>  
        
    </div>
</template>

<style scoped>

</style>