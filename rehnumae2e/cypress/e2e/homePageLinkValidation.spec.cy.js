describe('homePageLinkValidation', () => {

    beforeEach(() => {
        cy.visit('/')
      })

    it('validate, A/B Testing text from the home page', () => {
        cy.get('li:nth-of-type(1) > a')
            .should('have.attr', 'href', '/abtest'); 
    })

    it('validate, Add/Remove Elements text from the home page', () => {
        cy.get('li:nth-of-type(2) > a')
            .should('have.attr', 'href', '/add_remove_elements/');
    })

    it('validate, Basic Auth text from the home page', () => {
        cy.get('li:nth-of-type(3) > a')
            .should('have.attr', 'href', '/basic_auth');
    })

    it('validate, Broken Images text from the home page', () => {
        cy.get('li:nth-of-type(4) > a')
            .should('have.attr', 'href', '/broken_images');
    })
})
