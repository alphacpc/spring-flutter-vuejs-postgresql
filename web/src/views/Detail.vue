<script setup>
</script>

<template>
    <div>
        <div>
            <img className="h-[20rem] w-full object-cover" src="./../assets/images/maps.jpg" alt={{alt}}/>
        </div>
        <div className="px-8 py-4">
            <div className="glo-container flex">
                <div className="flex flex-col flex-1">
                    <div className="image-principale mb-2">
                        <img className="h-[40rem] w-full object-cover rounded-lg" src="./../assets/images/img1.jpg" alt={{alt}}/>
                    </div>
                    <div className="images-secondaire flex">
                        <div className="single-image w-1/4">
                            <img className="h-[15rem] w-full object-cover rounded-lg" src="./../assets/images/img2.jpg" alt={{alt}}/>
                        </div>
                        <div className="single-image w-1/4">
                            <img className="h-[15rem] w-full object-cover rounded-lg" src="./../assets/images/img3.jpg" alt={{alt}}/>
                        </div>
                        <div className="single-image w-1/4">
                            <img className="h-[15rem] w-full object-cover rounded-lg" src="./../assets/images/img4.jpg" alt={{alt}}/>
                        </div>
                        <div className="single-image w-1/4">
                            <img className="h-[15rem] w-full object-cover rounded-lg" src="./../assets/images/img5.jpg" alt={{alt}}/>
                        </div>
                    </div>
                </div>
                <div className="flex-1 bg-white ml-2 rounded-lg px-4 py-4">
                    <h1>TITRE</h1>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
</style>