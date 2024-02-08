; Author: Ginnette Serrano-Correa
; Date: 9/3/2023
; Description: this program adds two numbers
.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD
.data
; declare variables here
.code
main PROC
	mov eax, 5
	add eax, 6
INVOKE ExitProcess,0
main ENDP

END main