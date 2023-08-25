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
    <div className="bg-white p-4 border-t-2">
        <div>
            <router-link to="#" className="bg-orange-500 p-1 text-lg rounded mr-4">lieux</router-link>
            <router-link to="#" className="bg-orange-500 p-1 text-lg rounded">utilisateurs</router-link>
        </div>
        <apexchart width="500" type="line" :options="options" :series="series"></apexchart>
    </div>
</template>

<style scoped>
</style>