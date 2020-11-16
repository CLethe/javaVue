import Vue from 'vue'
import VueRouter from 'vue-router'
import Blogs from "@/components/Blogs";

Vue.use(VueRouter);

const routes = [
    {
        path: '/',
        component: Blogs
    },
    // {
    //     path: '/blogs',
    //     name: 'Blogs',
    //     component: Blogs
    // }
];

const router = new VueRouter({
    mode: 'history',
    // base: process.env.BASE_URL,
    routes: routes
});

export default router
