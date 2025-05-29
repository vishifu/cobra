import axios from 'axios';

// const baseURL = 'http://localhost:8080';
//
// const client = axios.create({
//   baseURL: baseURL
// });
//
// export const http = (opts) => {
//   const onSuccess = (response) => {
//     console.log(response);
//     return response.data;
//   };
//
//   const onError = (error) => {
//     console.error('Request Failed:', error.config);
//
//     if (error.response) {
//       // Request was made but server responded with something
//       // other than 2xx
//       console.error('Status:', error.response.status);
//       console.error('Data:', error.response.data);
//       console.error('Headers:', error.response.headers);
//     } else {
//       // Something else happened while setting up the request
//       // triggered the error
//       console.error('Error Message:', error.message);
//     }
//
//     return Promise.reject(error.response || error.message);
//   };
//
//   return client(opts).then(onSuccess).catch(onError);
// };
