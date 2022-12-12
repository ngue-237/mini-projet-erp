var express = require("express");
const Maintenance = require("../models/Maintenance");
var router = express.Router();

router.post("/", async (req, res) => {
  const maintenance = new Maintenance(req.body);
  try {
    await maintenance.save();
    res.json({ message: `Subcription added successfully!` });
    res.status(200);
  } catch (error) {
    res.json({ message: `Sothing wrong!` });
  }
});

router.get("/", async (req, res) => {
  const maintenances = await Maintenance.find();
  res.status(200).json(maintenances);
});

router.delete("/:_id", async (req, res) => {
  try {
    await Maintenance.findByIdAndDelete(req.params._id);
    res.status(200).json({ message: "deleted successfully" });
  } catch (error) {
    res.status(500).json({ message: "something wrong" });
  }
});

router.put("/:_id", async (req, res) => {
  // const maintenance = new Maintenance({
  //   nomPanne: req.body.nomPanne,
  //   dateDerniereM: req.body.dateDerniereM,
  //   idVehicule: req.body.idVehicule,
  // });
  console.log("j'ai là");
  Maintenance.findByIdAndUpdate(req.params._id, req.body);
  try {
    await Maintenance.findByIdAndUpdate(req.params._id, req.body);
  } catch (error) {
    res.status(500).json({ message: "something wrong!" });
  }
});

// router.get("/", async (req, res) => res.send("hello"));

module.exports = router;
