<script>

  export default {
      name : 'myChart',
      data: function() {
      return {
        options: {
          chart: {
            id: 'vuechart-example'
          },
          xaxis: {
            categories: [1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998]
          }
        },
        series: [{
          name: 'series-1',
          data: [30, 40, 45, 50, 49, 60, 70, 91]
        }]
      }
    }
  }
</script>

<template>
    <div className="bg-whit p-4 border-t-2">
        
        <div className="flex">
          <div className="w-[15rem] flex items-center">
            <div className="bg-white p-4 rounded w-full">
              <div className="rounded-full flex justify-center">
                <img src="./../assets/images/img1.jpg" className="object-cover border-4 border-green-500 w-[10rem] h-[10rem] rounded-full" />
              </div>
              <div className="flex flex-col text-center pt-4">
                <h2 className="font-bold">Alpha amadou Diallo</h2>
                <p className="font-light mt-1">Administrateur</p>
              </div>

              <div className="flex flex-col items-center h-[12vh] justify-between mt-4">
                <router-link to="#" className="border shadow w-full text-center p-2 rounded-sm text-lg">Tableau de bord</router-link>
                <!-- <router-link to="#" className="border shadow w-full text-center p-2 rounded-sm text-lg">Tous mes postes</router-link> -->
                <router-link to="#" className="bg-orange-600 text-white w-full text-center p-2 rounded-sm text-lg">Déconnexion</router-link>
              </div>
            </div>
          </div>
          
          <div className="flex-1 bg-white rounded-md py-4 px-4 ml-2 min-h-[85vh] max-h-[85vh]">
            <div className="div-charts flex justify-between flex-wrap">
              <apexchart className="w-1/3" type="line" :options="options" :series="series"></apexchart>
              <apexchart className="w-1/3" type="line" :options="options" :series="series"></apexchart>
              <apexchart className="w-1/3" type="line" :options="options" :series="series"></apexchart>
            </div>

            <div className="div-search-download bg-yellow-20 flex justify-between items-center flex-wrap py-4">
              <h1 className="text-3xl font-bold">Liste des articles</h1>
              <input type="search" id="search" name="search" placeholder="Recherche..." className="py-2 px-4 text-lg outline-none rounded-2xl"/>
              <div>
                <button className="py-2 px-4 shadow-md text-white bg-emerald-500 font-semibold rounded"><fa icon="add"/> Ajouter</button>
                <router-link to="#" className="py-2 px-4 shadow-md border-2 ml-2 border-orange-500 text-orange-500 bg-transparent font-semibold rounded"><fa icon="download" /> Exporter</router-link>
              </div>
            </div>
            <table className="w-full">
              <thead>
                <tr className="bg-slate-200 font-semibold rounded-md py-2">
                  <th className="py-4 font-bold text-lg uppercase text-center">Image</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Titre</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Categorie</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Description (courte)</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Note(s)</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Ville</th>
                  <th className="py-4 font-bold text-lg uppercase text-start">Cordonnées</th>
                  <th className="py-4 font-bold text-lg uppercase text-center">Actions</th>
                </tr>
              </thead>

              <tbody>

                <tr>
                  <td className="py-1 text-base border-b-2 text-center">Image</td>
                  <td className="py-1 text-base border-b-2">Keur malikounda</td>
                  <td className="py-1 text-base border-b-2">culture</td>
                  <td className="py-1 text-base border-b-2">lorem ipsum...</td>
                  <td className="py-1 text-base border-b-2">
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                  </td>
                  <td className="py-1 text-base border-b-2">Bignona</td>
                  <td className="py-1 text-base border-b-2 flex flex-col">
                    <span>lat (12.638378)</span>
                    <span>long (10.788378)</span>
                  </td>
                  <td className="py-1 text-base border-b-2 text-center">
                    <router-link className="bg-yellow-500 p-2 rounded-full" to="#"><fa icon="eye"/></router-link>
                    <router-link className="bg-green-500 text-white p-2 rounded-full mx-3" to="#"><fa icon="edit"/></router-link>
                    <router-link className="bg-red-600 text-white p-2 rounded-full" to="#"><fa icon="trash" className="bg-red-500"/></router-link>
                  </td>
                </tr>

                <tr>
                  <td className="py-1 text-base border-b-2 text-center">Image</td>
                  <td className="py-1 text-base border-b-2">Keur malikounda</td>
                  <td className="py-1 text-base border-b-2">culture</td>
                  <td className="py-1 text-base border-b-2">lorem ipsum...</td>
                  <td className="py-1 text-base border-b-2">
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                  </td>
                  <td className="py-1 text-base border-b-2">Bignona</td>
                  <td className="py-1 text-base border-b-2 flex flex-col">
                    <span>lat (12.638378)</span>
                    <span>long (10.788378)</span>
                  </td>
                  <td className="py-1 text-base border-b-2 text-center">
                    <router-link className="bg-yellow-500 p-2 rounded-full" to="#"><fa icon="eye"/></router-link>
                    <router-link className="bg-green-500 text-white p-2 rounded-full mx-3" to="#"><fa icon="edit"/></router-link>
                    <router-link className="bg-red-600 text-white p-2 rounded-full" to="#"><fa icon="trash" className="bg-red-500"/></router-link>
                  </td>
                </tr>

                <tr>
                  <td className="py-1 text-base border-b-2 text-center">Image</td>
                  <td className="py-1 text-base border-b-2">Keur malikounda</td>
                  <td className="py-1 text-base border-b-2">culture</td>
                  <td className="py-1 text-base border-b-2">lorem ipsum...</td>
                  <td className="py-1 text-base border-b-2">
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                  </td>
                  <td className="py-1 text-base border-b-2">Bignona</td>
                  <td className="py-1 text-base border-b-2 flex flex-col">
                    <span>lat (12.638378)</span>
                    <span>long (10.788378)</span>
                  </td>
                  <td className="py-1 text-base border-b-2 text-center">
                    <router-link className="bg-yellow-500 p-2 rounded-full" to="#"><fa icon="eye"/></router-link>
                    <router-link className="bg-green-500 text-white p-2 rounded-full mx-3" to="#"><fa icon="edit"/></router-link>
                    <router-link className="bg-red-600 text-white p-2 rounded-full" to="#"><fa icon="trash" className="bg-red-500"/></router-link>
                  </td>
                </tr>

                <tr>
                  <td className="py-1 text-base border-b-2 text-center">Image</td>
                  <td className="py-1 text-base border-b-2">Keur malikounda</td>
                  <td className="py-1 text-base border-b-2">culture</td>
                  <td className="py-1 text-base border-b-2">lorem ipsum...</td>
                  <td className="py-1 text-base border-b-2">
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                  </td>
                  <td className="py-1 text-base border-b-2">Bignona</td>
                  <td className="py-1 text-base border-b-2 flex flex-col">
                    <span>lat (12.638378)</span>
                    <span>long (10.788378)</span>
                  </td>
                  <td className="py-1 text-base border-b-2 text-center">
                    <router-link className="bg-yellow-500 p-2 rounded-full" to="#"><fa icon="eye"/></router-link>
                    <router-link className="bg-green-500 text-white p-2 rounded-full mx-3" to="#"><fa icon="edit"/></router-link>
                    <router-link className="bg-red-600 text-white p-2 rounded-full" to="#"><fa icon="trash" className="bg-red-500"/></router-link>
                  </td>
                </tr>

                <tr>
                  <td className="py-1 text-base border-b-2 text-center">Image</td>
                  <td className="py-1 text-base border-b-2">Keur malikounda</td>
                  <td className="py-1 text-base border-b-2">culture</td>
                  <td className="py-1 text-base border-b-2">lorem ipsum...</td>
                  <td className="py-1 text-base border-b-2">
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                    <fa icon="star" class="text-xl mr-2 text-yellow-400"/>
                  </td>
                  <td className="py-1 text-base border-b-2">Bignona</td>
                  <td className="py-1 text-base border-b-2 flex flex-col">
                    <span>lat (12.638378)</span>
                    <span>long (10.788378)</span>
                  </td>
                  <td className="py-1 text-base border-b-2 text-center">
                    <router-link className="bg-yellow-500 p-2 rounded-full" to="#"><fa icon="eye"/></router-link>
                    <router-link className="bg-green-500 text-white p-2 rounded-full mx-3" to="#"><fa icon="edit"/></router-link>
                    <router-link className="bg-red-600 text-white p-2 rounded-full" to="#"><fa icon="trash" className="bg-red-500"/></router-link>
                  </td>
                </tr>

              </tbody>

            </table>
        </div>
        </div>
        
    </div>
</template>

<style scoped>
</style>