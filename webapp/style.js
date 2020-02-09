class Style {

    constructor(styleText) {
        this.styleText = styleText;
    }

    applyToDocument(document) {
        const styleTag = document.createElement('style');
        const head = document.getElementsByTagName('head')[0];
        styleTag.innerText = this.styleText;
        head.appendChild(styleTag);
    }

}

export default Style;