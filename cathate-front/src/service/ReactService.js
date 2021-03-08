// import axios from "axios";
// import UrlCommon from "../constant/UrlCommon.js";
class ReactService {
  like(id) {
    console.log('Like ' + id);
  }

  dislike(id) {
    console.log('Dislike ' + id);
  }

  comment(comment) {
    console.log('Comment ' + comment);
  }

  share(id) {
    console.log('Share ' + id);
  }
}

export default new ReactService();
