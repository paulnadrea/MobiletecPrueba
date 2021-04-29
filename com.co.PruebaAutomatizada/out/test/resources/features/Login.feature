Feature: Login

  @lLoginSuccessful
    Scenario Outline: Login
      Given El usuario ingresa a la pagina web
      When El usuario ingresa <mail> y <contrasena>
      Then Debe ingresar al menu <validatexto>
      Examples:
        | usuario              | contrasena   | validatexto |
        | paulnadrea@gmail.com | Medellin2021 | Tu cuenta   |