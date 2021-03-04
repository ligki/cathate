import axios from "axios";
import UrlCommon from "../constant/UrlCommon.js";

class FactService {
    getRandomFact() {
        return axios.get(UrlCommon.CATFACT_NINJA + "/fact");
    }

    getRandomGifUrl() {
        return UrlCommon.CATAAS + "/cat?type=sq";
    }

    getRandomBreed() {
        return axios.get(UrlCommon.CATFACT_NINJA + "/breeds");
    }
}

export default new FactService();