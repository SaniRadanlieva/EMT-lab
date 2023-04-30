// import axios from "../custom-axios/axios";
//
// const instance = axios.create({
//     baseURL: 'http://localhost:9091/api',
//     headers:{
//         'Access-Control-Allow-Origin' : '*'
//     }
// })
//
// export default instance;
import axios from "axios";

const instance = axios.create({
    baseURL: 'http://localhost:9091/api',
    headers:{
        'Access-Control-Allow-Origin' : "*"
    }
})

export default instance;