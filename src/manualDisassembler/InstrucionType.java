package manualDisassembler;
/* @formatter:off */

public enum InstrucionType {
	
	I00,
	I01,
	I02,
	I10,
	
	I11,
	I12,
	I14,
	I15,
	I16,
	
	I20,
	I20A,
	I21,
	I22,
	I23,
	I24,
	I25,
	I26,
	I27,
	
	I30,
	I31,
	
	Z00,
	Z02,
	
	Z13,
	Z14,
	Z15,
	Z17,
	Z18,
	
	Z21,
	Z24,
	Z26
}// InstructionType

// Z00	0 arguments		- Instruction								????DJNZ
// Z02  0 arguments     - Instruction source target					SBC		HL,BC
// Z13	1 argument		- Instruction (Source + value2H)			INC	(IX+04H) length 3
// Z14	1 argument		- Instruction (Source + value2H)			INC	(IX+04H),7 length 4
// Z15	1 argument		- Instruction B,(Source + value2H)			LD	B,(IX+04H) length 3
// Z17	1 argument		- Instruction B,(Source + value2H)			LD	(IX+04H),B length 3
// Z18	1 argument		- instruction target,(Source + value2H)		BIT	0,(IX+06H)
// Z21	2 arguments		- instruction target,value2:value1H			LD		BC,0BCDEH
// Z24	2 arguments	???	- instruction (value3:value2H),source		LD		(03456H),BC
// Z26	2 arguments		- instruction target,(value2:value1H)		LD		BC,(0BCDEH)

// I00	0 arguments		- Instruction								DJNZ
// I01	0 arguments		- Instruction source						DEC	B
// I02  0 arguments     - Instruction source target					LD		B,A

// I10	1 argument		- Instruction value1						DJNZ	01H
// I11	1 argument		- instruction target, value1				LD		B,02H
// I12	1 argument		- instruction (value1H),Source				OUT	(03H),A
// I14	1 argument		- instruction (target+ value2H), Source		LD		(IX+05H),B
// I16	1 argument		- instruction target,(value1)				IN		A,(08H)

// I20	2 arguments		- instruction Lvalue2:value1				JP		L0789AH
// I20A	2 arguments		- instruction value2:value1					SHLD	0789AH
// I21	2 arguments		- instruction target,value2:value1H			LD		BC,0BCDEH
// I22	2 arguments		- instruction target,value3:value2H			LD		IX,0BCDEH
// I23	2 arguments		- instruction (value3:value2H),source		LD		(0F012H),IX
// I24	2 arguments	???	- instruction (value2:value1H),source		LD		(03456H),HL
// I25	2 arguments		- instruction target,(value3:value2H)		LD		IY,(0789AH)
// I26	2 arguments		- instruction target,(value2:value1H)		LD		HL,(0BCDEH)
// I27	2 arguments		- instruction (target + value2),value3		LD		(IX+0EH),00

// I31	2 arguments		- instruction target,Lvalue2:value1			JP		NZ,0BCDEH



/* @formatter:on  */