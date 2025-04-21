Feature: Verificar contenido del Google Sheet

  Scenario: Verificar que todos los casos de prueba se muestren correctamente
    Given el usuario abre la URL del Google Sheet
    When el documento se ha abierto
    Then se muestra la lista completa de casos de prueba