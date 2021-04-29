Feature: Login
  @hHomeSuccessful
  Scenario Outline: Inicio
    Given El usuario ingresa al home de la pagina web
    When El usuario da clic en mi <cuenta> y luego en <iniciar sesion>
    Then  Debe aparecer la pagina de ingresar credenciales <validaBoton>

  @lLoginSuccessful
    Scenario Outline: Login
      Given El usuario ingresa a la pagina web
      When El usuario ingresa <mail> y <contrasena>
      Then Debe ingresar al menu <validatexto>
      Examples:
        | usuario              | contrasena   | validatexto |
        | paulnadrea@gmail.com | Medellin2021 | Tu cuenta   |

  @bBuscarSuccessful
    Scenario Outline: Buscar un titulo
      Given El usuario busca un titulo
      When  El usuario ingresa el <titulo> a buscar
      Then Debe validar el resultado <validaresultado>
      Examples:
        | Titulo    | validaresultado  |
        | Proyectos | Resultados para: |
