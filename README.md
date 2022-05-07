# BDO-GearCalculator

**This code is heavily outdated and does not adhere to any coding conventions nor reflects my current experience.**

This application is in no way related to the current or prior producers or publishers of Black Desert Online.

---

The BDO-GearCalculator is a small tool with poor performance to calculate the cheapest accessories combination matching the minimum desired attack points (ap) for Black Desert Online. There is no UI during calculation, but you can identify and cancel the Java process using your task manager.

To customize the outcome, 3 parameters are used:
- (integer) minimum desired attack points (ap)
- (integer) limit the shown results/possible combinations
- (boolean) inclusion of accessories with item grade TET


Due to an incredible high amount of possible combinations it is recommended to work with a small amount of shown results. The performance depends on the available CPU, but usually takes a long time. Price is meassured in million silver.

This tool only considers important gear (and their price) that has ever been on the ingame market place by the end of 2016. TETs are optinal since these (though they have been on the market) are really rare but often very effective.

---

Run `git config --add include.path ../.gitconfig` to include the template config in your project config.
