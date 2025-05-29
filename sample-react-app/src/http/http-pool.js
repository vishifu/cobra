import axios from 'axios';

class Pool {
  pool = {};

  createAxiosInstance = (baseUrl) => {
    return axios.create({ baseURL: baseUrl });
  };

  obtain = (baseUrl) => {
    if (this.pool[baseUrl]) {
      return this.pool[baseUrl];
    } else {
      this.pool[baseUrl] = this.createAxiosInstance(baseUrl);
      return this.pool[baseUrl];
    }
  };

}

const HttpPool = new Pool();
export default HttpPool;
