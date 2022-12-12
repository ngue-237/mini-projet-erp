var express = require("express");
var path = require("path");
var cookieParser = require("cookie-parser");
var logger = require("morgan");
var mongoose = require("mongoose");

const maintenanceRouter = require("./routes/maintenant");
const eurekaHelper = require("./eureka-helper");

var app = express();

app.use(logger("dev"));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, "public")));

const uri = "mongodb://0.0.0.0:27017/maintenance_service";

//Database connection

mongoose.connect(uri, {
  useNewUrlParser: true,
});

mongoose.connection
  .once("open", () => console.log("connected !"))
  .on("error", (error) => {
    console.log("My error", error);
  });

app.use("/maintenace", maintenanceRouter);
eurekaHelper.registerWithEureka("maintenance-service", 3000);
module.exports = app;
