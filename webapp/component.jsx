import React from 'react';

class Cats extends React.Component {
  constructor(props) {
    super();

    this.renderedCats = props.cats.map(x => <div className="col-md-3 cats">
      <div className="panel panel-default">
        <div className="panel-heading">
          <h3 className="panel-title">{x.name}</h3>
        </div>
        <div className="panel-body">
          <img className="img-responsive" src={x.imageUrl} />
        </div>
      </div>
    </div>);
  }

  render() {
    return <div className="row">
      {this.renderedCats}
      </div>;
  }
}

export default Cats;
