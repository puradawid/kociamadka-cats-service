import React from 'react';
import ReactDOM from 'react-dom';

import Data from './data'

class Cats extends React.Component {
  constructor(props) {
    super();

    this.renderedCats = props.cats.map(x => <div className="cat">
      <div className="name">{x.name}</div>
      <img src={x.imageUrl} />
    </div>);
  }

  render() {
    return <div className="cats">
      {this.renderedCats}
      </div>;
  }
}

export default Cats;

const wrapper = document.getElementById("catsContainer");
const data = new Data();
data.loadData((cats) => {
  wrapper ? ReactDOM.render(<Cats cats={cats}/>, wrapper) : false;
});
