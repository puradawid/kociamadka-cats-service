import Style from "./style";
import Data from "./data";
import ReactDOM from "react-dom";
import Cats from "./component.jsx";

const wrapper = document.getElementById("catsContainer");

const styleCss = require('./style.css');

const smallerContainer = wrapper.parentElement.parentElement;
if (smallerContainer.classList.contains('col-md-6')) {
    let classes = [];
    smallerContainer.classList.forEach((x) => {
        classes.push(x);
    });
    classes.forEach(x => {
        smallerContainer.classList.remove(x);
    });
    smallerContainer.classList.add('col-md-12');
}

const style = new Style(styleCss);
style.applyToDocument(document);

const data = new Data("https://7y9wactnad.execute-api.eu-central-1.amazonaws.com/Prod/kociamadkaplFetchCats");
data.loadData((cats) => {
    wrapper ? ReactDOM.render(<Cats cats={cats}/>, wrapper) : false;
});
