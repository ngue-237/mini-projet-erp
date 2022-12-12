const mongoose = require("mongoose");
var Schema = mongoose.Schema;

const Maintenance = new Schema({
  nomPanne: String,
  dateDerniereM: Date,
  idVehicule: String,
});

module.exports = mongoose.model("Maintenance", Maintenance);
