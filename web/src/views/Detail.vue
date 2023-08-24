<script setup>
</script>

<template>
    <div>
        <div>
            <img className="h-[12rem] w-full object-cover" src="./../assets/images/maps.jpg" alt={{alt}}/>
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
                    <h1 className="text-4xl font-bold">Keur malikounda, Bignona</h1>
    
                    <div className="flex justify-between items-center">
                        <p className="pt-4 text-lg"><fa icon="location"/> 12.53736 (Lat), 12.53736 (Long)</p>
                        <p className="font-bold text-2xl text-green-500"><fa icon="building"/> Sédhiou</p>
                    </div>

                    <div className="pt-4">
                        <h2 className="font-semibold text-lg py-2 text-orange-500">Description courte</h2>
                        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aut ea nisi officia, pariatur quasi quod accusamus vitae iusto nobis obcaecati repellat tempore magni possimus eveniet, dolor adipisci debitis in similique.</p>
                    </div>
                    <div className="pt-4">
                        <h2 className="font-semibold text-lg py-2 text-orange-500">Description longue</h2>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime perferendis tenetur officia officiis vero. Sit nesciunt tempora perferendis eum, voluptatem quisquam? Nemo, hic? Est, explicabo itaque tempora consectetur placeat laborum.
                        Laudantium asperiores omnis tempora est nulla illum, ratione atque rem beatae debitis soluta iure magnam alias. Quia possimus consequatur exercitationem! Dignissimos iure recusandae dolorem vero fuga sint voluptate repellendus iste!
                        Quasi quam optio laborum id quos minima quibusdam illum reprehenderit ab obcaecati dolor corrupti ut dolores iste vitae modi, necessitatibus dolorem, repellendus et voluptates! Aliquam magnam distinctio cum. Eligendi, consequuntur.
                        Nisi sed, dignissimos laudantium iusto obcaecati voluptas saepe omnis praesentium deleniti consectetur quibusdam nesciunt laborum qui, quo vero. Eos quam veritatis ratione voluptates tenetur impedit repudiandae! Fugiat illum quo quos?</p>
                    </div>
                    <div>
                        <h2 className="font-semibold text-center py-4 text-xl">Associé à ...</h2>
                        <div>
                            <span>1</span>
                            <span>2</span>
                            <span>3</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
</style>