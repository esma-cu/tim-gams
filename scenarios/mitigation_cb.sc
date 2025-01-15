$ SET LPOINT no_mitigation
$ SET FIXBOH 2022

$BATINCLUDE base-bulk.dd
$BATINCLUDE ind_ccs.dd
$BATINCLUDE pwr_dh.dd
$BATINCLUDE pwr_newtechs.dd
$BATINCLUDE rsd-retrofit.dd
$BATINCLUDE rsd_newtechs.dd
$BATINCLUDE srv_dc_excessheat.dd
$BATINCLUDE srv_newtechs.dd
$BATINCLUDE sup_biorefineries.dd
$BATINCLUDE sup_h2newtechs.dd
$BATINCLUDE sys_othernewtechs.dd
$BATINCLUDE tra_newvehicles.dd
$BATINCLUDE syssettings.dd
$BATINCLUDE a_sys_sad_40ts.dd
$BATINCLUDE b_sys_additional_assumptions.dd
$BATINCLUDE b_sys_demands.dd
$BATINCLUDE b_sup_dombiopot_baseline.dd
$BATINCLUDE b_ind_emi_proc-bulk.dd
$BATINCLUDE b_ind_mitigations.dd
$BATINCLUDE b_pwr_ccs.dd
$BATINCLUDE b_srv_dc_eh.dd
$BATINCLUDE b_pwr_rnw_potentials.dd
$BATINCLUDE b_sys_historic_bounds.dd
$BATINCLUDE b_ind_emissions-bulk.dd
$BATINCLUDE b_rsd_retrofit-ctrl.dd
$BATINCLUDE b_rsd_uc.dd
$BATINCLUDE b_srv_uc.dd
$BATINCLUDE b_pwr_snsp_limit.dd
$BATINCLUDE b_sys_bio_delivcost.dd
$BATINCLUDE b_sys_maxgrowthrates.dd
$BATINCLUDE b_rsd_unitboilers.dd
$BATINCLUDE b_tra_p_modalshares.dd
$BATINCLUDE b_tra_newcars_retirement.dd
$BATINCLUDE sys_carbonbudget.dd
$BATINCLUDE b_tra_stock_retirement.dd
$BATINCLUDE sys_carbonbudget_sector.dd
$BATINCLUDE b_tra_emissions.dd
$BATINCLUDE b_tra_ev_parity.dd
$BATINCLUDE b_tra_f_modalshares.dd
$BATINCLUDE milestonyr.dd

$SET RUN_NAME 'mitigation_cb'