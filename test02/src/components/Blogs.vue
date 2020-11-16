<template>
    <div>
        <el-timeline :reverse="reverse">
            <el-timeline-item
                    v-for="blog in blogs"
                    :key="blog.id"
                    :timestamp="blog.created">
                <el-card>
                    <h4>{{blog.title}}</h4>
                    <p>{{blog.description}}</p>
                </el-card>
            </el-timeline-item>
        </el-timeline>
    </div>
</template>

<script>
    export default {
        name: "Blogs",
        data() {
            return {
                blogs: {}
            }
        },
        methods: {
            findAll() {
                const _this = this;
                _this.$axios.get("/blog").then(res => {
                    console.log(res);
                    _this.blogs = res.data.data;
                }).catch(error => {
                    console.log(error);
                })
            }
        },
        created() {
            this.findAll();
        }
    }

</script>

<style scoped>

</style>