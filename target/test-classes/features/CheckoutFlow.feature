Feature: Como cliente, quiero ingresar los credenciales de mi cuenta, para realizar una compra dentro del sitio

  @CheckOutFlow
  Scenario: El cliente inicia sesión en el sitio de compras y realiza una compra
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: nelson.ceballos@academy.ar
    And el cliente ingresa su password: Testing01
    And el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de My Account

    When el cliente hace click en el botón TSHIRTS
    And el cliente hace click en el botón ITEM
    Then el cliente verifica que fue redireccionado a la pantalla de Detailed Item

    When el cliente hace click en el botón AddToCart
    Then el cliente verifica que fue redireccionado a la pantalla de ItemAdded

    When el cliente hace click en el botón GotoCheckout
    Then el cliente verifica que fue redireccionado a la pantalla de Checkout

    When el cliente hace click en el botón GotoCheckout2
    Then el cliente verifica que fue redireccionado a la pantalla de Checkout2
    
    When el cliente hace click en el botón GotoCheckout3
    Then el cliente verifica que fue redireccionado a la pantalla de Checkout3

    When el cliente hace click en el botón Checkbox
    And el cliente hace click en el botón GotoCheckout4
    Then el cliente verifica que fue redireccionado a la pantalla de Checkout4

    When el cliente hace click en el botón PayByBank
    And el cliente hace click en el botón Confirm
    Then el cliente verifica que fue redireccionado a la pantalla de Confirmation




