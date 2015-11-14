
class Ship {

	private int ShipNum; //Ship的数量
	
	private Ship[] Ship; //Ship数组，用于储存Ship坐标
	
	private int LocationX1;	private int LocationX2;	private int LocationX3; //Ship坐标
	private int LocationY1;	private int LocationY2;	private int LocationY3;
	
    public int X1; public int X2; public int X3; public int Y1; public int Y2; public int Y3; public int X; public int Y; public int n; //于GameLauncher中使用
	
	public void setShip(int Size) { //生成Ship坐标
		if (Size == 9) { //设置Ship数量
			ShipNum = 6;
		} else if (Size == 7) {
			ShipNum = 5;
		} else {
			ShipNum = 3;
		}
		int i = 0;
		Ship = new Ship[ShipNum]; //初始化Ship数组，用于储存Ship坐标
		while (i < ShipNum) {
			Ship[i] = new Ship();
			i++;
		}
		
		Location Location = new Location();
		if (ShipNum == 6) {  //生成6艘船
			//生成第1艘船坐标
			Location.setShip(Size);
			Ship[0].LocationX1 = Location.getLocationX1();
			Ship[0].LocationX2 = Location.getLocationX2();
			Ship[0].LocationX3 = Location.getLocationX3();
			Ship[0].LocationY1 = Location.getLocationY1();
			Ship[0].LocationY2 = Location.getLocationY2();
			Ship[0].LocationY3 = Location.getLocationY3();
			
			//System.out.println("第1艘船");
			//System.out.println("X:  " + Ship[0].LocationX1 + "-" + Ship[0].LocationX2 + "-" + Ship[0].LocationX3);
			//System.out.println("Y:  " + Ship[0].LocationY1 + "-" + Ship[0].LocationY2 + "-" + Ship[0].LocationY3);
		
			//生成第2艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												Location.setShip(Size);
												Ship[1].LocationX1 = Location.getLocationX1();
												Ship[1].LocationX2 = Location.getLocationX2();
												Ship[1].LocationX3 = Location.getLocationX3();
												Ship[1].LocationY1 = Location.getLocationY1();
												Ship[1].LocationY2 = Location.getLocationY2();
												Ship[1].LocationY3 = Location.getLocationY3();
											} while (Ship[0].LocationX1 == Ship[1].LocationX1 && Ship[0].LocationY1 == Ship[1].LocationY1);
										} while (Ship[0].LocationX2 == Ship[1].LocationX1 && Ship[0].LocationY2 == Ship[1].LocationY1);
									} while (Ship[0].LocationX3 == Ship[1].LocationX1 && Ship[0].LocationY3 == Ship[1].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[1].LocationX2 && Ship[0].LocationY1 == Ship[1].LocationY2);
							} while (Ship[0].LocationX2 == Ship[1].LocationX2 && Ship[0].LocationY2 == Ship[1].LocationY2);
						} while (Ship[0].LocationX3 == Ship[1].LocationX2 && Ship[0].LocationY3 == Ship[1].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[1].LocationX3 && Ship[0].LocationY1 == Ship[1].LocationY3);
				} while (Ship[0].LocationX2 == Ship[1].LocationX3 && Ship[0].LocationY2 == Ship[1].LocationY3);
			} while (Ship[0].LocationX3 == Ship[1].LocationX3 && Ship[0].LocationY3 == Ship[1].LocationY3);
			
			//System.out.println("第2艘船");
			//System.out.println("X:  " + Ship[1].LocationX1 + "-" + Ship[1].LocationX2 + "-" + Ship[1].LocationX3);
			//System.out.println("Y:  " + Ship[1].LocationY1 + "-" + Ship[1].LocationY2 + "-" + Ship[1].LocationY3);
			
			//生成第3艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					Location.setShip(Size);
																					Ship[2].LocationX1 = Location.getLocationX1();
																					Ship[2].LocationX2 = Location.getLocationX2();
																					Ship[2].LocationX3 = Location.getLocationX3();
																					Ship[2].LocationY1 = Location.getLocationY1();
																					Ship[2].LocationY2 = Location.getLocationY2();
																					Ship[2].LocationY3 = Location.getLocationY3();
																				} while (Ship[1].LocationX1 == Ship[2].LocationX1 && Ship[1].LocationY1 == Ship[2].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[2].LocationX1 && Ship[1].LocationY2 == Ship[2].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[2].LocationX1 && Ship[1].LocationY3 == Ship[2].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[2].LocationX2 && Ship[1].LocationY1 == Ship[2].LocationY2);
																} while (Ship[1].LocationX2 == Ship[2].LocationX2 && Ship[1].LocationY2 == Ship[2].LocationY2);
															} while (Ship[1].LocationX3 == Ship[2].LocationX2 && Ship[1].LocationY3 == Ship[2].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[2].LocationX3 && Ship[1].LocationY1 == Ship[2].LocationY3);
													} while (Ship[1].LocationX2 == Ship[2].LocationX3 && Ship[1].LocationY2 == Ship[2].LocationY3);
												} while (Ship[1].LocationX3 == Ship[2].LocationX3 && Ship[1].LocationY3 == Ship[2].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[2].LocationX1 && Ship[0].LocationY1 == Ship[2].LocationY1);
										} while (Ship[0].LocationX2 == Ship[2].LocationX1 && Ship[0].LocationY2 == Ship[2].LocationY1);
									} while (Ship[0].LocationX3 == Ship[2].LocationX1 && Ship[0].LocationY3 == Ship[2].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[2].LocationX2 && Ship[0].LocationY1 == Ship[2].LocationY2);
							} while (Ship[0].LocationX2 == Ship[2].LocationX2 && Ship[0].LocationY2 == Ship[2].LocationY2);
						} while (Ship[0].LocationX3 == Ship[2].LocationX2 && Ship[0].LocationY3 == Ship[2].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[2].LocationX3 && Ship[0].LocationY1 == Ship[2].LocationY3);
				} while (Ship[0].LocationX2 == Ship[2].LocationX3 && Ship[0].LocationY2 == Ship[2].LocationY3);
			} while (Ship[0].LocationX3 == Ship[2].LocationX3 && Ship[0].LocationY3 == Ship[2].LocationY3);
			
			//System.out.println("第3艘船");
			//System.out.println("X:  " + Ship[2].LocationX1 + "-" + Ship[2].LocationX2 + "-" + Ship[2].LocationX3);
			//System.out.println("Y:  " + Ship[2].LocationY1 + "-" + Ship[2].LocationY2 + "-" + Ship[2].LocationY3);
			
			//生成第4艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					
																					//判断是否与第3艘船重叠
																					do { //判断第1个点
																						do {
																							do {
																								
																								do { //判断第2个点
																									do {
																										do {
																											
																											do { //判断第3个点
																												do {
																													do {
																														Location.setShip(Size);
																														Ship[3].LocationX1 = Location.getLocationX1();
																														Ship[3].LocationX2 = Location.getLocationX2();
																														Ship[3].LocationX3 = Location.getLocationX3();
																														Ship[3].LocationY1 = Location.getLocationY1();
																														Ship[3].LocationY2 = Location.getLocationY2();
																														Ship[3].LocationY3 = Location.getLocationY3();
																													} while (Ship[2].LocationX1 == Ship[3].LocationX1 && Ship[2].LocationY1 == Ship[3].LocationY1);
																												} while (Ship[2].LocationX2 == Ship[3].LocationX1 && Ship[2].LocationY2 == Ship[3].LocationY1);
																											} while (Ship[2].LocationX3 == Ship[3].LocationX1 && Ship[2].LocationY3 == Ship[3].LocationY1);
																											
																										} while (Ship[2].LocationX1 == Ship[3].LocationX2 && Ship[2].LocationY1 == Ship[3].LocationY2);
																									} while (Ship[2].LocationX2 == Ship[3].LocationX2 && Ship[2].LocationY2 == Ship[3].LocationY2);
																								} while (Ship[2].LocationX3 == Ship[3].LocationX2 && Ship[2].LocationY3 == Ship[3].LocationY2);
																								
																							} while (Ship[2].LocationX1 == Ship[3].LocationX3 && Ship[2].LocationY1 == Ship[3].LocationY3);
																						} while (Ship[2].LocationX2 == Ship[3].LocationX3 && Ship[2].LocationY2 == Ship[3].LocationY3);
																					} while (Ship[2].LocationX3 == Ship[3].LocationX3 && Ship[2].LocationY3 == Ship[3].LocationY3);
																					
																				} while (Ship[1].LocationX1 == Ship[3].LocationX1 && Ship[1].LocationY1 == Ship[3].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[3].LocationX1 && Ship[1].LocationY2 == Ship[3].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[3].LocationX1 && Ship[1].LocationY3 == Ship[3].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[3].LocationX2 && Ship[1].LocationY1 == Ship[3].LocationY2);
																} while (Ship[1].LocationX2 == Ship[3].LocationX2 && Ship[1].LocationY2 == Ship[3].LocationY2);
															} while (Ship[1].LocationX3 == Ship[3].LocationX2 && Ship[1].LocationY3 == Ship[3].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[3].LocationX3 && Ship[1].LocationY1 == Ship[3].LocationY3);
													} while (Ship[1].LocationX2 == Ship[3].LocationX3 && Ship[1].LocationY2 == Ship[3].LocationY3);
												} while (Ship[1].LocationX3 == Ship[3].LocationX3 && Ship[1].LocationY3 == Ship[3].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[3].LocationX1 && Ship[0].LocationY1 == Ship[3].LocationY1);
										} while (Ship[0].LocationX2 == Ship[3].LocationX1 && Ship[0].LocationY2 == Ship[3].LocationY1);
									} while (Ship[0].LocationX3 == Ship[3].LocationX1 && Ship[0].LocationY3 == Ship[3].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[3].LocationX2 && Ship[0].LocationY1 == Ship[3].LocationY2);
							} while (Ship[0].LocationX2 == Ship[3].LocationX2 && Ship[0].LocationY2 == Ship[3].LocationY2);
						} while (Ship[0].LocationX3 == Ship[3].LocationX2 && Ship[0].LocationY3 == Ship[3].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[3].LocationX3 && Ship[0].LocationY1 == Ship[3].LocationY3);
				} while (Ship[0].LocationX2 == Ship[3].LocationX3 && Ship[0].LocationY2 == Ship[3].LocationY3);
			} while (Ship[0].LocationX3 == Ship[3].LocationX3 && Ship[0].LocationY3 == Ship[3].LocationY3);
			
			//System.out.println("第4艘船");
			//System.out.println("X:  " + Ship[3].LocationX1 + "-" + Ship[3].LocationX2 + "-" + Ship[3].LocationX3);
			//System.out.println("Y:  " + Ship[3].LocationY1 + "-" + Ship[3].LocationY2 + "-" + Ship[3].LocationY3);
			
			//生成第5艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					
																					//判断是否与第3艘船重叠
																					do { //判断第1个点
																						do {
																							do {
																								
																								do { //判断第2个点
																									do {
																										do {
																											
																											do { //判断第3个点
																												do {
																													do {
																														
																														//判断是否与第4艘船重叠
																														do { //判断第1个点
																															do {
																																do {
																																	
																																	do { //判断第2个点
																																		do {
																																			do {
																																				
																																				do { //判断第3个点
																																					do {
																																						do {
																																							Location.setShip(Size);
																																							Ship[4].LocationX1 = Location.getLocationX1();
																																							Ship[4].LocationX2 = Location.getLocationX2();
																																							Ship[4].LocationX3 = Location.getLocationX3();
																																							Ship[4].LocationY1 = Location.getLocationY1();
																																							Ship[4].LocationY2 = Location.getLocationY2();
																																							Ship[4].LocationY3 = Location.getLocationY3();
																																						} while (Ship[3].LocationX1 == Ship[4].LocationX1 && Ship[3].LocationY1 == Ship[4].LocationY1);
																																					} while (Ship[3].LocationX2 == Ship[4].LocationX1 && Ship[3].LocationY2 == Ship[4].LocationY1);
																																				} while (Ship[3].LocationX3 == Ship[4].LocationX1 && Ship[3].LocationY3 == Ship[4].LocationY1);
																																				
																																			} while (Ship[3].LocationX1 == Ship[4].LocationX2 && Ship[3].LocationY1 == Ship[4].LocationY2);
																																		} while (Ship[3].LocationX2 == Ship[4].LocationX2 && Ship[3].LocationY2 == Ship[4].LocationY2);
																																	} while (Ship[3].LocationX3 == Ship[4].LocationX2 && Ship[3].LocationY3 == Ship[4].LocationY2);
																																	
																																} while (Ship[3].LocationX1 == Ship[4].LocationX3 && Ship[3].LocationY1 == Ship[4].LocationY3);
																															} while (Ship[3].LocationX2 == Ship[4].LocationX3 && Ship[3].LocationY2 == Ship[4].LocationY3);
																														} while (Ship[3].LocationX3 == Ship[4].LocationX3 && Ship[3].LocationY3 == Ship[4].LocationY3);
																																						
																													} while (Ship[2].LocationX1 == Ship[4].LocationX1 && Ship[2].LocationY1 == Ship[4].LocationY1);
																												} while (Ship[2].LocationX2 == Ship[4].LocationX1 && Ship[2].LocationY2 == Ship[4].LocationY1);
																											} while (Ship[2].LocationX3 == Ship[4].LocationX1 && Ship[2].LocationY3 == Ship[4].LocationY1);
																											
																										} while (Ship[2].LocationX1 == Ship[4].LocationX2 && Ship[2].LocationY1 == Ship[4].LocationY2);
																									} while (Ship[2].LocationX2 == Ship[4].LocationX2 && Ship[2].LocationY2 == Ship[4].LocationY2);
																								} while (Ship[2].LocationX3 == Ship[4].LocationX2 && Ship[2].LocationY3 == Ship[4].LocationY2);
																								
																							} while (Ship[2].LocationX1 == Ship[4].LocationX3 && Ship[2].LocationY1 == Ship[4].LocationY3);
																						} while (Ship[2].LocationX2 == Ship[4].LocationX3 && Ship[2].LocationY2 == Ship[4].LocationY3);
																					} while (Ship[2].LocationX3 == Ship[4].LocationX3 && Ship[2].LocationY3 == Ship[4].LocationY3);
																					
																				} while (Ship[1].LocationX1 == Ship[4].LocationX1 && Ship[1].LocationY1 == Ship[4].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[4].LocationX1 && Ship[1].LocationY2 == Ship[4].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[4].LocationX1 && Ship[1].LocationY3 == Ship[4].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[4].LocationX2 && Ship[1].LocationY1 == Ship[4].LocationY2);
																} while (Ship[1].LocationX2 == Ship[4].LocationX2 && Ship[1].LocationY2 == Ship[4].LocationY2);
															} while (Ship[1].LocationX3 == Ship[4].LocationX2 && Ship[1].LocationY3 == Ship[4].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[4].LocationX3 && Ship[1].LocationY1 == Ship[4].LocationY3);
													} while (Ship[1].LocationX2 == Ship[4].LocationX3 && Ship[1].LocationY2 == Ship[4].LocationY3);
												} while (Ship[1].LocationX3 == Ship[4].LocationX3 && Ship[1].LocationY3 == Ship[4].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[4].LocationX1 && Ship[0].LocationY1 == Ship[4].LocationY1);
										} while (Ship[0].LocationX2 == Ship[4].LocationX1 && Ship[0].LocationY2 == Ship[4].LocationY1);
									} while (Ship[0].LocationX3 == Ship[4].LocationX1 && Ship[0].LocationY3 == Ship[4].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[4].LocationX2 && Ship[0].LocationY1 == Ship[4].LocationY2);
							} while (Ship[0].LocationX2 == Ship[4].LocationX2 && Ship[0].LocationY2 == Ship[4].LocationY2);
						} while (Ship[0].LocationX3 == Ship[4].LocationX2 && Ship[0].LocationY3 == Ship[4].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[4].LocationX3 && Ship[0].LocationY1 == Ship[4].LocationY3);
				} while (Ship[0].LocationX2 == Ship[4].LocationX3 && Ship[0].LocationY2 == Ship[4].LocationY3);
			} while (Ship[0].LocationX3 == Ship[4].LocationX3 && Ship[0].LocationY3 == Ship[4].LocationY3);
			
			//System.out.println("第5艘船");
			//System.out.println("X:  " + Ship[4].LocationX1 + "-" + Ship[4].LocationX2 + "-" + Ship[4].LocationX3);
			//System.out.println("Y:  " + Ship[4].LocationY1 + "-" + Ship[4].LocationY2 + "-" + Ship[4].LocationY3);
			
			//生成第6艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					
																					//判断是否与第3艘船重叠
																					do { //判断第1个点
																						do {
																							do {
																								
																								do { //判断第2个点
																									do {
																										do {
																											
																											do { //判断第3个点
																												do {
																													do {
																														
																														//判断是否与第4艘船重叠
																														do { //判断第1个点
																															do {
																																do {
																																	
																																	do { //判断第2个点
																																		do {
																																			do {
																																				
																																				do { //判断第3个点
																																					do {
																																						do {
																																							
																																							//判断是否与第5艘船重叠
																																							do { //判断第1个点
																																								do {
																																									do {
																																										
																																										do { //判断第2个点
																																											do {
																																												do {
																																													
																																													do { //判断第3个点
																																														do {
																																															do {
																																																Location.setShip(Size);
																																																Ship[5].LocationX1 = Location.getLocationX1();
																																																Ship[5].LocationX2 = Location.getLocationX2();
																																																Ship[5].LocationX3 = Location.getLocationX3();
																																																Ship[5].LocationY1 = Location.getLocationY1();
																																																Ship[5].LocationY2 = Location.getLocationY2();
																																																Ship[5].LocationY3 = Location.getLocationY3();
																																															} while (Ship[4].LocationX1 == Ship[5].LocationX1 && Ship[4].LocationY1 == Ship[5].LocationY1);
																																														} while (Ship[4].LocationX2 == Ship[5].LocationX1 && Ship[4].LocationY2 == Ship[5].LocationY1);
																																													} while (Ship[4].LocationX3 == Ship[5].LocationX1 && Ship[4].LocationY3 == Ship[5].LocationY1);
																																													
																																												} while (Ship[4].LocationX1 == Ship[5].LocationX2 && Ship[4].LocationY1 == Ship[5].LocationY2);
																																											} while (Ship[4].LocationX2 == Ship[5].LocationX2 && Ship[4].LocationY2 == Ship[5].LocationY2);
																																										} while (Ship[4].LocationX3 == Ship[5].LocationX2 && Ship[4].LocationY3 == Ship[5].LocationY2);
																																										
																																									} while (Ship[4].LocationX1 == Ship[5].LocationX3 && Ship[4].LocationY1 == Ship[5].LocationY3);
																																								} while (Ship[4].LocationX2 == Ship[5].LocationX3 && Ship[4].LocationY2 == Ship[5].LocationY3);
																																							} while (Ship[4].LocationX3 == Ship[5].LocationX3 && Ship[4].LocationY3 == Ship[5].LocationY3);
																																							
																																						} while (Ship[3].LocationX1 == Ship[5].LocationX1 && Ship[3].LocationY1 == Ship[5].LocationY1);
																																					} while (Ship[3].LocationX2 == Ship[5].LocationX1 && Ship[3].LocationY2 == Ship[5].LocationY1);
																																				} while (Ship[3].LocationX3 == Ship[5].LocationX1 && Ship[3].LocationY3 == Ship[5].LocationY1);
																																				
																																			} while (Ship[3].LocationX1 == Ship[5].LocationX2 && Ship[3].LocationY1 == Ship[5].LocationY2);
																																		} while (Ship[3].LocationX2 == Ship[5].LocationX2 && Ship[3].LocationY2 == Ship[5].LocationY2);
																																	} while (Ship[3].LocationX3 == Ship[5].LocationX2 && Ship[3].LocationY3 == Ship[5].LocationY2);
																																	
																																} while (Ship[3].LocationX1 == Ship[5].LocationX3 && Ship[3].LocationY1 == Ship[5].LocationY3);
																															} while (Ship[3].LocationX2 == Ship[5].LocationX3 && Ship[3].LocationY2 == Ship[5].LocationY3);
																														} while (Ship[3].LocationX3 == Ship[5].LocationX3 && Ship[3].LocationY3 == Ship[5].LocationY3);
																																						
																													} while (Ship[2].LocationX1 == Ship[5].LocationX1 && Ship[2].LocationY1 == Ship[5].LocationY1);
																												} while (Ship[2].LocationX2 == Ship[5].LocationX1 && Ship[2].LocationY2 == Ship[5].LocationY1);
																											} while (Ship[2].LocationX3 == Ship[5].LocationX1 && Ship[2].LocationY3 == Ship[5].LocationY1);
																											
																										} while (Ship[2].LocationX1 == Ship[5].LocationX2 && Ship[2].LocationY1 == Ship[5].LocationY2);
																									} while (Ship[2].LocationX2 == Ship[5].LocationX2 && Ship[2].LocationY2 == Ship[5].LocationY2);
																								} while (Ship[2].LocationX3 == Ship[5].LocationX2 && Ship[2].LocationY3 == Ship[5].LocationY2);
																								
																							} while (Ship[2].LocationX1 == Ship[5].LocationX3 && Ship[2].LocationY1 == Ship[5].LocationY3);
																						} while (Ship[2].LocationX2 == Ship[5].LocationX3 && Ship[2].LocationY2 == Ship[5].LocationY3);
																					} while (Ship[2].LocationX3 == Ship[5].LocationX3 && Ship[2].LocationY3 == Ship[5].LocationY3);
																					
																				} while (Ship[1].LocationX1 == Ship[5].LocationX1 && Ship[1].LocationY1 == Ship[5].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[5].LocationX1 && Ship[1].LocationY2 == Ship[5].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[5].LocationX1 && Ship[1].LocationY3 == Ship[5].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[5].LocationX2 && Ship[1].LocationY1 == Ship[5].LocationY2);
																} while (Ship[1].LocationX2 == Ship[5].LocationX2 && Ship[1].LocationY2 == Ship[5].LocationY2);
															} while (Ship[1].LocationX3 == Ship[5].LocationX2 && Ship[1].LocationY3 == Ship[5].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[5].LocationX3 && Ship[1].LocationY1 == Ship[5].LocationY3);
													} while (Ship[1].LocationX2 == Ship[5].LocationX3 && Ship[1].LocationY2 == Ship[5].LocationY3);
												} while (Ship[1].LocationX3 == Ship[5].LocationX3 && Ship[1].LocationY3 == Ship[5].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[5].LocationX1 && Ship[0].LocationY1 == Ship[5].LocationY1);
										} while (Ship[0].LocationX2 == Ship[5].LocationX1 && Ship[0].LocationY2 == Ship[5].LocationY1);
									} while (Ship[0].LocationX3 == Ship[5].LocationX1 && Ship[0].LocationY3 == Ship[5].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[5].LocationX2 && Ship[0].LocationY1 == Ship[5].LocationY2);
							} while (Ship[0].LocationX2 == Ship[5].LocationX2 && Ship[0].LocationY2 == Ship[5].LocationY2);
						} while (Ship[0].LocationX3 == Ship[5].LocationX2 && Ship[0].LocationY3 == Ship[5].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[5].LocationX3 && Ship[0].LocationY1 == Ship[5].LocationY3);
				} while (Ship[0].LocationX2 == Ship[5].LocationX3 && Ship[0].LocationY2 == Ship[5].LocationY3);
			} while (Ship[0].LocationX3 == Ship[5].LocationX3 && Ship[0].LocationY3 == Ship[5].LocationY3);
			
			//System.out.println("第6艘船");
			//System.out.println("X:  " + Ship[5].LocationX1 + "-" + Ship[5].LocationX2 + "-" + Ship[5].LocationX3);
			//System.out.println("Y:  " + Ship[5].LocationY1 + "-" + Ship[5].LocationY2 + "-" + Ship[5].LocationY3);
			
			
		} else if (ShipNum == 5) {  //生成5艘船
			//生成第1艘船坐标
			Location.setShip(Size);
			Ship[0].LocationX1 = Location.getLocationX1();
			Ship[0].LocationX2 = Location.getLocationX2();
			Ship[0].LocationX3 = Location.getLocationX3();
			Ship[0].LocationY1 = Location.getLocationY1();
			Ship[0].LocationY2 = Location.getLocationY2();
			Ship[0].LocationY3 = Location.getLocationY3();
			
			//System.out.println("第1艘船");
			//System.out.println("X:  " + Ship[0].LocationX1 + "-" + Ship[0].LocationX2 + "-" + Ship[0].LocationX3);
			//System.out.println("Y:  " + Ship[0].LocationY1 + "-" + Ship[0].LocationY2 + "-" + Ship[0].LocationY3);
		
			//生成第2艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												Location.setShip(Size);
												Ship[1].LocationX1 = Location.getLocationX1();
												Ship[1].LocationX2 = Location.getLocationX2();
												Ship[1].LocationX3 = Location.getLocationX3();
												Ship[1].LocationY1 = Location.getLocationY1();
												Ship[1].LocationY2 = Location.getLocationY2();
												Ship[1].LocationY3 = Location.getLocationY3();
											} while (Ship[0].LocationX1 == Ship[1].LocationX1 && Ship[0].LocationY1 == Ship[1].LocationY1);
										} while (Ship[0].LocationX2 == Ship[1].LocationX1 && Ship[0].LocationY2 == Ship[1].LocationY1);
									} while (Ship[0].LocationX3 == Ship[1].LocationX1 && Ship[0].LocationY3 == Ship[1].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[1].LocationX2 && Ship[0].LocationY1 == Ship[1].LocationY2);
							} while (Ship[0].LocationX2 == Ship[1].LocationX2 && Ship[0].LocationY2 == Ship[1].LocationY2);
						} while (Ship[0].LocationX3 == Ship[1].LocationX2 && Ship[0].LocationY3 == Ship[1].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[1].LocationX3 && Ship[0].LocationY1 == Ship[1].LocationY3);
				} while (Ship[0].LocationX2 == Ship[1].LocationX3 && Ship[0].LocationY2 == Ship[1].LocationY3);
			} while (Ship[0].LocationX3 == Ship[1].LocationX3 && Ship[0].LocationY3 == Ship[1].LocationY3);
			
			//System.out.println("第2艘船");
			//System.out.println("X:  " + Ship[1].LocationX1 + "-" + Ship[1].LocationX2 + "-" + Ship[1].LocationX3);
			//System.out.println("Y:  " + Ship[1].LocationY1 + "-" + Ship[1].LocationY2 + "-" + Ship[1].LocationY3);
			
			//生成第3艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					Location.setShip(Size);
																					Ship[2].LocationX1 = Location.getLocationX1();
																					Ship[2].LocationX2 = Location.getLocationX2();
																					Ship[2].LocationX3 = Location.getLocationX3();
																					Ship[2].LocationY1 = Location.getLocationY1();
																					Ship[2].LocationY2 = Location.getLocationY2();
																					Ship[2].LocationY3 = Location.getLocationY3();
																				} while (Ship[1].LocationX1 == Ship[2].LocationX1 && Ship[1].LocationY1 == Ship[2].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[2].LocationX1 && Ship[1].LocationY2 == Ship[2].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[2].LocationX1 && Ship[1].LocationY3 == Ship[2].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[2].LocationX2 && Ship[1].LocationY1 == Ship[2].LocationY2);
																} while (Ship[1].LocationX2 == Ship[2].LocationX2 && Ship[1].LocationY2 == Ship[2].LocationY2);
															} while (Ship[1].LocationX3 == Ship[2].LocationX2 && Ship[1].LocationY3 == Ship[2].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[2].LocationX3 && Ship[1].LocationY1 == Ship[2].LocationY3);
													} while (Ship[1].LocationX2 == Ship[2].LocationX3 && Ship[1].LocationY2 == Ship[2].LocationY3);
												} while (Ship[1].LocationX3 == Ship[2].LocationX3 && Ship[1].LocationY3 == Ship[2].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[2].LocationX1 && Ship[0].LocationY1 == Ship[2].LocationY1);
										} while (Ship[0].LocationX2 == Ship[2].LocationX1 && Ship[0].LocationY2 == Ship[2].LocationY1);
									} while (Ship[0].LocationX3 == Ship[2].LocationX1 && Ship[0].LocationY3 == Ship[2].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[2].LocationX2 && Ship[0].LocationY1 == Ship[2].LocationY2);
							} while (Ship[0].LocationX2 == Ship[2].LocationX2 && Ship[0].LocationY2 == Ship[2].LocationY2);
						} while (Ship[0].LocationX3 == Ship[2].LocationX2 && Ship[0].LocationY3 == Ship[2].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[2].LocationX3 && Ship[0].LocationY1 == Ship[2].LocationY3);
				} while (Ship[0].LocationX2 == Ship[2].LocationX3 && Ship[0].LocationY2 == Ship[2].LocationY3);
			} while (Ship[0].LocationX3 == Ship[2].LocationX3 && Ship[0].LocationY3 == Ship[2].LocationY3);
			
			//System.out.println("第3艘船");
			//System.out.println("X:  " + Ship[2].LocationX1 + "-" + Ship[2].LocationX2 + "-" + Ship[2].LocationX3);
			//System.out.println("Y:  " + Ship[2].LocationY1 + "-" + Ship[2].LocationY2 + "-" + Ship[2].LocationY3);
			
			//生成第4艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					
																					//判断是否与第3艘船重叠
																					do { //判断第1个点
																						do {
																							do {
																								
																								do { //判断第2个点
																									do {
																										do {
																											
																											do { //判断第3个点
																												do {
																													do {
																														Location.setShip(Size);
																														Ship[3].LocationX1 = Location.getLocationX1();
																														Ship[3].LocationX2 = Location.getLocationX2();
																														Ship[3].LocationX3 = Location.getLocationX3();
																														Ship[3].LocationY1 = Location.getLocationY1();
																														Ship[3].LocationY2 = Location.getLocationY2();
																														Ship[3].LocationY3 = Location.getLocationY3();
																													} while (Ship[2].LocationX1 == Ship[3].LocationX1 && Ship[2].LocationY1 == Ship[3].LocationY1);
																												} while (Ship[2].LocationX2 == Ship[3].LocationX1 && Ship[2].LocationY2 == Ship[3].LocationY1);
																											} while (Ship[2].LocationX3 == Ship[3].LocationX1 && Ship[2].LocationY3 == Ship[3].LocationY1);
																											
																										} while (Ship[2].LocationX1 == Ship[3].LocationX2 && Ship[2].LocationY1 == Ship[3].LocationY2);
																									} while (Ship[2].LocationX2 == Ship[3].LocationX2 && Ship[2].LocationY2 == Ship[3].LocationY2);
																								} while (Ship[2].LocationX3 == Ship[3].LocationX2 && Ship[2].LocationY3 == Ship[3].LocationY2);
																								
																							} while (Ship[2].LocationX1 == Ship[3].LocationX3 && Ship[2].LocationY1 == Ship[3].LocationY3);
																						} while (Ship[2].LocationX2 == Ship[3].LocationX3 && Ship[2].LocationY2 == Ship[3].LocationY3);
																					} while (Ship[2].LocationX3 == Ship[3].LocationX3 && Ship[2].LocationY3 == Ship[3].LocationY3);
																					
																				} while (Ship[1].LocationX1 == Ship[3].LocationX1 && Ship[1].LocationY1 == Ship[3].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[3].LocationX1 && Ship[1].LocationY2 == Ship[3].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[3].LocationX1 && Ship[1].LocationY3 == Ship[3].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[3].LocationX2 && Ship[1].LocationY1 == Ship[3].LocationY2);
																} while (Ship[1].LocationX2 == Ship[3].LocationX2 && Ship[1].LocationY2 == Ship[3].LocationY2);
															} while (Ship[1].LocationX3 == Ship[3].LocationX2 && Ship[1].LocationY3 == Ship[3].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[3].LocationX3 && Ship[1].LocationY1 == Ship[3].LocationY3);
													} while (Ship[1].LocationX2 == Ship[3].LocationX3 && Ship[1].LocationY2 == Ship[3].LocationY3);
												} while (Ship[1].LocationX3 == Ship[3].LocationX3 && Ship[1].LocationY3 == Ship[3].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[3].LocationX1 && Ship[0].LocationY1 == Ship[3].LocationY1);
										} while (Ship[0].LocationX2 == Ship[3].LocationX1 && Ship[0].LocationY2 == Ship[3].LocationY1);
									} while (Ship[0].LocationX3 == Ship[3].LocationX1 && Ship[0].LocationY3 == Ship[3].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[3].LocationX2 && Ship[0].LocationY1 == Ship[3].LocationY2);
							} while (Ship[0].LocationX2 == Ship[3].LocationX2 && Ship[0].LocationY2 == Ship[3].LocationY2);
						} while (Ship[0].LocationX3 == Ship[3].LocationX2 && Ship[0].LocationY3 == Ship[3].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[3].LocationX3 && Ship[0].LocationY1 == Ship[3].LocationY3);
				} while (Ship[0].LocationX2 == Ship[3].LocationX3 && Ship[0].LocationY2 == Ship[3].LocationY3);
			} while (Ship[0].LocationX3 == Ship[3].LocationX3 && Ship[0].LocationY3 == Ship[3].LocationY3);
			
			//System.out.println("第4艘船");
			//System.out.println("X:  " + Ship[3].LocationX1 + "-" + Ship[3].LocationX2 + "-" + Ship[3].LocationX3);
			//System.out.println("Y:  " + Ship[3].LocationY1 + "-" + Ship[3].LocationY2 + "-" + Ship[3].LocationY3);
			
			//生成第5艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					
																					//判断是否与第3艘船重叠
																					do { //判断第1个点
																						do {
																							do {
																								
																								do { //判断第2个点
																									do {
																										do {
																											
																											do { //判断第3个点
																												do {
																													do {
																														
																														//判断是否与第4艘船重叠
																														do { //判断第1个点
																															do {
																																do {
																																	
																																	do { //判断第2个点
																																		do {
																																			do {
																																				
																																				do { //判断第3个点
																																					do {
																																						do {
																																							Location.setShip(Size);
																																							Ship[4].LocationX1 = Location.getLocationX1();
																																							Ship[4].LocationX2 = Location.getLocationX2();
																																							Ship[4].LocationX3 = Location.getLocationX3();
																																							Ship[4].LocationY1 = Location.getLocationY1();
																																							Ship[4].LocationY2 = Location.getLocationY2();
																																							Ship[4].LocationY3 = Location.getLocationY3();
																																						} while (Ship[3].LocationX1 == Ship[4].LocationX1 && Ship[3].LocationY1 == Ship[4].LocationY1);
																																					} while (Ship[3].LocationX2 == Ship[4].LocationX1 && Ship[3].LocationY2 == Ship[4].LocationY1);
																																				} while (Ship[3].LocationX3 == Ship[4].LocationX1 && Ship[3].LocationY3 == Ship[4].LocationY1);
																																				
																																			} while (Ship[3].LocationX1 == Ship[4].LocationX2 && Ship[3].LocationY1 == Ship[4].LocationY2);
																																		} while (Ship[3].LocationX2 == Ship[4].LocationX2 && Ship[3].LocationY2 == Ship[4].LocationY2);
																																	} while (Ship[3].LocationX3 == Ship[4].LocationX2 && Ship[3].LocationY3 == Ship[4].LocationY2);
																																	
																																} while (Ship[3].LocationX1 == Ship[4].LocationX3 && Ship[3].LocationY1 == Ship[4].LocationY3);
																															} while (Ship[3].LocationX2 == Ship[4].LocationX3 && Ship[3].LocationY2 == Ship[4].LocationY3);
																														} while (Ship[3].LocationX3 == Ship[4].LocationX3 && Ship[3].LocationY3 == Ship[4].LocationY3);
																																						
																													} while (Ship[2].LocationX1 == Ship[4].LocationX1 && Ship[2].LocationY1 == Ship[4].LocationY1);
																												} while (Ship[2].LocationX2 == Ship[4].LocationX1 && Ship[2].LocationY2 == Ship[4].LocationY1);
																											} while (Ship[2].LocationX3 == Ship[4].LocationX1 && Ship[2].LocationY3 == Ship[4].LocationY1);
																											
																										} while (Ship[2].LocationX1 == Ship[4].LocationX2 && Ship[2].LocationY1 == Ship[4].LocationY2);
																									} while (Ship[2].LocationX2 == Ship[4].LocationX2 && Ship[2].LocationY2 == Ship[4].LocationY2);
																								} while (Ship[2].LocationX3 == Ship[4].LocationX2 && Ship[2].LocationY3 == Ship[4].LocationY2);
																								
																							} while (Ship[2].LocationX1 == Ship[4].LocationX3 && Ship[2].LocationY1 == Ship[4].LocationY3);
																						} while (Ship[2].LocationX2 == Ship[4].LocationX3 && Ship[2].LocationY2 == Ship[4].LocationY3);
																					} while (Ship[2].LocationX3 == Ship[4].LocationX3 && Ship[2].LocationY3 == Ship[4].LocationY3);
																					
																				} while (Ship[1].LocationX1 == Ship[4].LocationX1 && Ship[1].LocationY1 == Ship[4].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[4].LocationX1 && Ship[1].LocationY2 == Ship[4].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[4].LocationX1 && Ship[1].LocationY3 == Ship[4].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[4].LocationX2 && Ship[1].LocationY1 == Ship[4].LocationY2);
																} while (Ship[1].LocationX2 == Ship[4].LocationX2 && Ship[1].LocationY2 == Ship[4].LocationY2);
															} while (Ship[1].LocationX3 == Ship[4].LocationX2 && Ship[1].LocationY3 == Ship[4].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[4].LocationX3 && Ship[1].LocationY1 == Ship[4].LocationY3);
													} while (Ship[1].LocationX2 == Ship[4].LocationX3 && Ship[1].LocationY2 == Ship[4].LocationY3);
												} while (Ship[1].LocationX3 == Ship[4].LocationX3 && Ship[1].LocationY3 == Ship[4].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[4].LocationX1 && Ship[0].LocationY1 == Ship[4].LocationY1);
										} while (Ship[0].LocationX2 == Ship[4].LocationX1 && Ship[0].LocationY2 == Ship[4].LocationY1);
									} while (Ship[0].LocationX3 == Ship[4].LocationX1 && Ship[0].LocationY3 == Ship[4].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[4].LocationX2 && Ship[0].LocationY1 == Ship[4].LocationY2);
							} while (Ship[0].LocationX2 == Ship[4].LocationX2 && Ship[0].LocationY2 == Ship[4].LocationY2);
						} while (Ship[0].LocationX3 == Ship[4].LocationX2 && Ship[0].LocationY3 == Ship[4].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[4].LocationX3 && Ship[0].LocationY1 == Ship[4].LocationY3);
				} while (Ship[0].LocationX2 == Ship[4].LocationX3 && Ship[0].LocationY2 == Ship[4].LocationY3);
			} while (Ship[0].LocationX3 == Ship[4].LocationX3 && Ship[0].LocationY3 == Ship[4].LocationY3);
			
			//System.out.println("第5艘船");
			//System.out.println("X:  " + Ship[4].LocationX1 + "-" + Ship[4].LocationX2 + "-" + Ship[4].LocationX3);
			//System.out.println("Y:  " + Ship[4].LocationY1 + "-" + Ship[4].LocationY2 + "-" + Ship[4].LocationY3);

			
		} else {  //生成3艘船
			//生成第1艘船坐标
			Location.setShip(Size);
			Ship[0].LocationX1 = Location.getLocationX1();
			Ship[0].LocationX2 = Location.getLocationX2();
			Ship[0].LocationX3 = Location.getLocationX3();
			Ship[0].LocationY1 = Location.getLocationY1();
			Ship[0].LocationY2 = Location.getLocationY2();
			Ship[0].LocationY3 = Location.getLocationY3();
			
			//System.out.println("第1艘船");
			//System.out.println("X:  " + Ship[0].LocationX1 + "-" + Ship[0].LocationX2 + "-" + Ship[0].LocationX3);
			//System.out.println("Y:  " + Ship[0].LocationY1 + "-" + Ship[0].LocationY2 + "-" + Ship[0].LocationY3);
		
			//生成第2艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												Location.setShip(Size);
												Ship[1].LocationX1 = Location.getLocationX1();
												Ship[1].LocationX2 = Location.getLocationX2();
												Ship[1].LocationX3 = Location.getLocationX3();
												Ship[1].LocationY1 = Location.getLocationY1();
												Ship[1].LocationY2 = Location.getLocationY2();
												Ship[1].LocationY3 = Location.getLocationY3();
											} while (Ship[0].LocationX1 == Ship[1].LocationX1 && Ship[0].LocationY1 == Ship[1].LocationY1);
										} while (Ship[0].LocationX2 == Ship[1].LocationX1 && Ship[0].LocationY2 == Ship[1].LocationY1);
									} while (Ship[0].LocationX3 == Ship[1].LocationX1 && Ship[0].LocationY3 == Ship[1].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[1].LocationX2 && Ship[0].LocationY1 == Ship[1].LocationY2);
							} while (Ship[0].LocationX2 == Ship[1].LocationX2 && Ship[0].LocationY2 == Ship[1].LocationY2);
						} while (Ship[0].LocationX3 == Ship[1].LocationX2 && Ship[0].LocationY3 == Ship[1].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[1].LocationX3 && Ship[0].LocationY1 == Ship[1].LocationY3);
				} while (Ship[0].LocationX2 == Ship[1].LocationX3 && Ship[0].LocationY2 == Ship[1].LocationY3);
			} while (Ship[0].LocationX3 == Ship[1].LocationX3 && Ship[0].LocationY3 == Ship[1].LocationY3);
			
			//System.out.println("第2艘船");
			//System.out.println("X:  " + Ship[1].LocationX1 + "-" + Ship[1].LocationX2 + "-" + Ship[1].LocationX3);
			//System.out.println("Y:  " + Ship[1].LocationY1 + "-" + Ship[1].LocationY2 + "-" + Ship[1].LocationY3);
			
			//生成第3艘船坐标
			//判断是否与第1艘船重叠
			do { //判断第1个点
				do {
					do {
						
						do { //判断第2个点
							do {
								do {
									
									do { //判断第3个点
										do {
											do {
												
												//判断是否与第2艘船重叠
												do { //判断第1个点
													do {
														do {
															
															do { //判断第2个点
																do {
																	do {
																		
																		do { //判断第3个点
																			do {
																				do {
																					Location.setShip(Size);
																					Ship[2].LocationX1 = Location.getLocationX1();
																					Ship[2].LocationX2 = Location.getLocationX2();
																					Ship[2].LocationX3 = Location.getLocationX3();
																					Ship[2].LocationY1 = Location.getLocationY1();
																					Ship[2].LocationY2 = Location.getLocationY2();
																					Ship[2].LocationY3 = Location.getLocationY3();
																				} while (Ship[1].LocationX1 == Ship[2].LocationX1 && Ship[1].LocationY1 == Ship[2].LocationY1);
																			} while (Ship[1].LocationX2 == Ship[2].LocationX1 && Ship[1].LocationY2 == Ship[2].LocationY1);
																		} while (Ship[1].LocationX3 == Ship[2].LocationX1 && Ship[1].LocationY3 == Ship[2].LocationY1);
																		
																	} while (Ship[1].LocationX1 == Ship[2].LocationX2 && Ship[1].LocationY1 == Ship[2].LocationY2);
																} while (Ship[1].LocationX2 == Ship[2].LocationX2 && Ship[1].LocationY2 == Ship[2].LocationY2);
															} while (Ship[1].LocationX3 == Ship[2].LocationX2 && Ship[1].LocationY3 == Ship[2].LocationY2);
															
														} while (Ship[1].LocationX1 == Ship[2].LocationX3 && Ship[1].LocationY1 == Ship[2].LocationY3);
													} while (Ship[1].LocationX2 == Ship[2].LocationX3 && Ship[1].LocationY2 == Ship[2].LocationY3);
												} while (Ship[1].LocationX3 == Ship[2].LocationX3 && Ship[1].LocationY3 == Ship[2].LocationY3);
												
											} while (Ship[0].LocationX1 == Ship[2].LocationX1 && Ship[0].LocationY1 == Ship[2].LocationY1);
										} while (Ship[0].LocationX2 == Ship[2].LocationX1 && Ship[0].LocationY2 == Ship[2].LocationY1);
									} while (Ship[0].LocationX3 == Ship[2].LocationX1 && Ship[0].LocationY3 == Ship[2].LocationY1);
										
								} while (Ship[0].LocationX1 == Ship[2].LocationX2 && Ship[0].LocationY1 == Ship[2].LocationY2);
							} while (Ship[0].LocationX2 == Ship[2].LocationX2 && Ship[0].LocationY2 == Ship[2].LocationY2);
						} while (Ship[0].LocationX3 == Ship[2].LocationX2 && Ship[0].LocationY3 == Ship[2].LocationY2);
							
					} while (Ship[0].LocationX1 == Ship[2].LocationX3 && Ship[0].LocationY1 == Ship[2].LocationY3);
				} while (Ship[0].LocationX2 == Ship[2].LocationX3 && Ship[0].LocationY2 == Ship[2].LocationY3);
			} while (Ship[0].LocationX3 == Ship[2].LocationX3 && Ship[0].LocationY3 == Ship[2].LocationY3);
			
			//System.out.println("第3艘船");
			//System.out.println("X:  " + Ship[2].LocationX1 + "-" + Ship[2].LocationX2 + "-" + Ship[2].LocationX3);
			//System.out.println("Y:  " + Ship[2].LocationY1 + "-" + Ship[2].LocationY2 + "-" + Ship[2].LocationY3);
		}
	}
	
	public int getLocationX1(int ShipName) { //返回X1
		return Ship[ShipName].LocationX1;
	}
	
	public int getLocationX2(int ShipName) { //返回X2
		return Ship[ShipName].LocationX2;
	}
	
	public int getLocationX3(int ShipName) { //返回X3
		return Ship[ShipName].LocationX3;
	}
	
	public int getLocationY1(int ShipName) { //返回Y1
		return Ship[ShipName].LocationY1;
	}
	
	public int getLocationY2(int ShipName) { //返回Y2
		return Ship[ShipName].LocationY2;
	}
	
	public int getLocationY3(int ShipName) { //返回Y3
		return Ship[ShipName].LocationY3;
	}
	
}
