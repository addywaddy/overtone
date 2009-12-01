(ns overtone.instrument.sampler
  (:use (overtone synth envelope pitch)))

; TODO: Implement in native synthdefs a more full featured sampler 
; with reasonable defaults and some helpers...

; (
; s.sendMsg("/b_allocRead", 0, "/home/rosejn/projects/overtone/instruments/samples/kit/boom.wav");
; s.sendMsg("/b_allocRead", 1, "/home/rosejn/projects/overtone/instruments/samples/kit/open-hat.wav");
; s.sendMsg("/b_allocRead", 2, "/home/rosejn/projects/overtone/instruments/samples/kit/crikix.wav");
; )
; 
; ( 
;  SynthDef("granular", {|out = 0, buf = 0, pan = 0.0, start = 0.0, amp = 1.0, dur=0.25|
;      var grain, env; 
;      grain = PlayBuf.ar(1,buf, BufRateScale.kr(buf), 1, BufFrames.ir(buf)*start,0);
;      env = (EnvGen.kr(Env.perc(0.01,dur),doneAction:2)-0.001); 
;      Out.ar(out, Pan2.ar(grain * env, pan, amp));
;      }).store; 
;  ) 
; c = Synth("granular", ["buf", 0, "dur", 2.0, "start", 0.0]);
; c = Synth("granular", ["buf", 1, "dur", 1.0, "pan", 0.5]);
; c = Synth("granular", ["buf", 2, "dur", 2]);
; 
; s.sendMsg("/b_close", 0); // close the file.
; s.sendMsg("/b_close", 1); // close the file.
; s.sendMsg("/b_close", 2); // close the file.
; s.sendMsg("/b_free", 0); // frees the buffer
; 
