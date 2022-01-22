# BDO-GearCalculator (prior 6ap)

6ap is a small tool with poor performance to calculate the cheapest accessoires combination 
giving you atleast your desired ap. THERE IS NO UI DURING CALCULATION, check that Java process with that high cpu usage.

To customize the outcome, 6ap uses 3 parameters:
- desired ap
- amount of shown results/possible combinations
- consideration of TETs

Open a console on your current path, type in:

`java 6ap.jar "integer" "integer" "boolean"` (for example: `java 6ap.jar "53" "20" "false"`)

This tool only considers important gear (and their price) that has ever been on the ingame market place by the end of 2016.
Due to an incredible high amount of possible combinations it is recommended to use work with a small amount of shown results.
THE CALCULATION TAKES LONG, depends strongly on your cpu though. Price is meassured in million silver.
TETs are optinal since these (though they have been on the market) are really rare but often very effective.

---

Template to include license information and useful files in all projects

Run `git config --add include.path ../.gitconfig` to include the template config in your project config.
