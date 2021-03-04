<template>
  <!-- Navbar-->
<header class="header">
    <nav class="navbar navbar-expand-lg fixed-top py-3">
        <div class="container">
          <a href="#" class="navbar-brand text-uppercase font-weight-bold">Cat Hate</a>
          <button type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler navbar-toggler-right"><i class="fa fa-bars"></i></button>
          
          <div id="navbarSupportedContent" class="collapse navbar-collapse">
              <ul class="navbar-nav ml-auto">
                  <li class="nav-item active"><a href="#" class="nav-link text-uppercase font-weight-bold">Stories <span class="sr-only">(current)</span></a></li>
                  <li class="nav-item"><a href="#" class="nav-link text-uppercase font-weight-bold">Videos</a></li>
                  <li class="nav-item"><a href="#" class="nav-link text-uppercase font-weight-bold">Troll</a></li>
                  <li class="nav-item"><a href="#" class="nav-link text-uppercase font-weight-bold">About</a></li>
                  <li class="nav-item"><a href="#" class="nav-link text-uppercase font-weight-bold">Contact</a></li>
              </ul>
          </div>
        </div>
    </nav>
</header>
</template>

<script>
export default {
    name: "Header",
    head: {
      script: [
        {
          type: "text/javascript",
          src: "/js/common.js",
        }
      ],
    },
    data() {
      return {
        
      }
    },
    methods: {
      
    },

    watch: {
      
    }

}
</script>

<style scoped>
/*
*
* ==========================================
* CUSTOM UTIL CLASSES
* ==========================================
*
*/
.header {
    margin-top: 80px;
}
.navbar {
    transition: all 0.4s;
}

.navbar .nav-link {
    color: black;
}

.navbar .nav-link:hover,
.navbar .nav-link:focus {
    color: black;
    text-decoration: none;
}

.navbar .navbar-brand {
    color: black;
}


/* Change navbar styling on scroll */
.navbar.active {
    background: #fff;
    box-shadow: 1px 2px 10px rgba(0, 0, 0, 0.1);
}

.navbar.active .nav-link {
    color: #555;
}

.navbar.active .nav-link:hover,
.navbar.active .nav-link:focus {
    color: #555;
    text-decoration: none;
}

.navbar.active .navbar-brand {
    color: #555;
}


/* Change navbar styling on small viewports */
@media (max-width: 991.98px) {
    .navbar {
        background: #fff;
    }

    .navbar .navbar-brand, .navbar .nav-link {
        color: #555;
    }
}



/*
*
* ==========================================
* FOR DEMO PURPOSES
* ==========================================
*
*/
.text-small {
    font-size: 0.9rem !important;
}


body {
    min-height: 110vh;
    background-color: #4ca1af;
    background-image: linear-gradient(135deg, #4ca1af 0%, #c4e0e5 100%);
}

</style>