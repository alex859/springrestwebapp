import $ from 'jquery';
import React from 'react';

class AwesomeComponent extends React.Component {

  constructor(props) {
    super(props);
    this.state = {likesCount : 0};
    this.onLike = this.onLike.bind(this);
  }

  onLike () {
    let that = this;
    $.get("/api/names").then(function (data){
      that.setState({
        names: data
      });
    });
  }

  render() {
    return (
      <div>
        Likes : <span>{this.state.names}</span>
        <div><button onClick={this.onLike}>Like Me</button></div>
      </div>
    );
  }

}

export default AwesomeComponent;