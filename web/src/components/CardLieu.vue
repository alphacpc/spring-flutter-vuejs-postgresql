<script setup>


</script>

<template>



        <div class="flex flex-col card w-1/6 bg-white rounded-xl mr-8 mb-8">
            <div className="flex relative">
                <div className="absolute flex justify-between w-full px-2 z-10 top-2">
                    <span className="bg-yellow-400 font-thin text-sm px-1 py-0 h-5 cursor-pointer rounded">culture</span>
                    <span className="cursor-pointer"><fa icon="heart"/></span>
                </div>
                <img className="h-[15rem] w-full object-fill rounded-xl" src="./../assets/images/img1.jpg" alt={{alt}}/>
            </div>
            <div className="px-1 p-3">
                <div className="flex justify-between items-center">
                    <router-link to="/detail">
                        <h2 className="font-bold text-lg">Keur malikounda, Bignona</h2>
                    </router-link>
                    <span><fa icon="star"/> 4,5</span>
                </div>
                <p className="py-2"><fa icon="location"/> 12.53736 (Lat), 12.53736 (Long)</p>
                <p className="text-sm font-extralight text-justify">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Doloremque dicta modi cumque sapiente, sed sint aliq...</p>
            </div>
        </div>


</template>

<style scoped>

</style>