<template>
  <a-layout>
    <!--    上-->
    <the-header/>
    <!--    中-->
    <router-view/>
    <!--    下-->
    <the-footer/>
  </a-layout>
</template>

<script lang="ts">
import {defineAsyncComponent} from "vue";

export default {
  name: "App",
  components: {
    "TheHeader":defineAsyncComponent(/* webpackChunkName:"the-header" */()=>import("./components/The-Header.vue")),
    "TheFooter":defineAsyncComponent(/* webpackChunkName:"the-header" */()=>import("./components/The-Footer.vue"))
  }
}
</script>
<style>

</style>