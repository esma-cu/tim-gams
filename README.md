# tim-gams

To obtain the model, including the TIMES source code, run the following command:
> git clone --recurse-submodules https://github.com/esma-cu/tim-gams

To run a specific scenario (e.g. no_mitigation) execute the following command from root:
> GAMS runmodel --scenario=no_mitigation

The model is solved using [HiGHS](https://highs.dev/) by default. Adjust the command to solve it e.g., with CPLEX:
> GAMS runmodel --scenario=no_mitigation --solve_with=CPLEX
