const path = require('path');

module.exports = {
  mode: 'production',
  entry: path.resolve(__dirname, "Boot.jsx"),
  devtool: 'source-map',
  module: {
    rules: [{
      test: /\.(js|jsx)$/,
      exclude: /node_modules/,
      use: {
        loader: 'babel-loader'
      }
    }, {
      test: /\.css$/,
      use: [
        'css-loader'
      ]
    }]
  }
};
