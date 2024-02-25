const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootptg21/",
            name: "springbootptg21",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootptg21/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "共享单车系统"
        } 
    }
}
export default base
